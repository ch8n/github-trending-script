package dev.ch8n

import IssueResponse
import com.google.gson.Gson
import dev.ch_n.GithubTrends.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.Request
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter


data class TrendingDTO(
    val id: Int,
    val description: String,
    val createdAt: Long,
    val displayDate: String,
    val repositories: List<Repository>
)

data class Repository(
    val name: String,
    val author: String,
    val url: String,
    val description: String,
)


fun main() {

    val owner = "vitalets"
    val repo = "github-trending-repos"
    val issueNumber = "92"
    val token = BuildConfig.Github_Access_Token

    val url = "https://api.github.com/repos/$owner/$repo/issues/$issueNumber/comments"

    val client = OkHttpClient()

    val request = Request.Builder()
        .url(url)
        .header("Accept", "application/vnd.github+json")
        .header("Authorization", "Bearer $token")
        .header("X-GitHub-Api-Version", "2022-11-28")
        .build()

    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) {
            throw RuntimeException("Failed to retrieve comments: $response")
        }

        val responseBody = response.body?.string()
//        println(responseBody)
        val response: IssueResponse = Gson().fromJson(responseBody, IssueResponse::class.java)
        val trendings = response.map {

            // date formatting
            val inputFormat = DateTimeFormatter.ISO_DATE_TIME
            val outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            val dateTime = LocalDateTime.parse(it.createdAt, inputFormat)
            val formattedDate = dateTime.format(outputFormat)
            val millis = dateTime.atZone(ZoneOffset.UTC).toInstant().toEpochMilli()

            // parsing repository
            val sample = it.body ?: ""
            val pattern = """\[(.*?)\]\((.*?)\)\n(.*?)\n"""
            val matches = Regex(pattern).findAll(sample)
            val repositories = matches.map { matchResult ->
                val (repoName, repoUrl, description) = matchResult.groupValues.drop(1)
                Repository(
                    name = repoName,
                    author = repoName,
                    url = repoUrl,
                    description = description,
                )
            }.toList()
            TrendingDTO(
                id = it.id ?: 0,
                description = it.body ?: "",
                displayDate = formattedDate ?: "",
                createdAt = millis,
                repositories = repositories
            )
        }

        println(trendings.mapIndexed { index, trendingDTO ->
            "$index ${trendingDTO.repositories}"
        }.joinToString("\n"))
    }
}