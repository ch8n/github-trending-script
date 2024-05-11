import com.google.gson.annotations.SerializedName

class IssueResponse : ArrayList<IssueResponse.ModelItem>() {

    data class ModelItem(
        @SerializedName("author_association")
        val authorAssociation: String? = null, // COLLABORATOR
        @SerializedName("body")
        val body: String? = null, // **New daily trending repos in Kotlin!**[hectorqin / reader](https://github.com/hectorqin/reader)阅读3服务器版，桌面端，iOS可用。后端 Kotlin + Spring Boot + Vert.x + Coroutine ；前端 Vue.js + Element。麻烦点点star，关注一下公众号【假装大佬】❗️ Demo服务器由于未备案已被关停，建议自行搭建> Reading 3 server version, desktop version, and iOS are available. Back-end Kotlin + Spring Boot + Vert.x + Coroutine; front-end Vue.js + Element. Please star and follow the official account [Pretend to be a Boss] ❗️ The demo server has been shut down due to lack of registration. It is recommended to build it yourself***+11** stars today*[adrielcafe / voyager](https://github.com/adrielcafe/voyager)🛸 A pragmatic navigation library for Jetpack Compose***+3** stars today*[plateaukao / einkbro](https://github.com/plateaukao/einkbro)A small, fast web browser based on Android WebView. It's tailored for E-Ink devices but also works great on normal android devices.***+1** stars today*[chrisbanes / tivi](https://github.com/chrisbanes/tivi)Tivi is a TV show tracking Android app, which connects to trakt.tv
        @SerializedName("created_at")
        val createdAt: String? = null, // 2024-04-11T00:07:27Z
        @SerializedName("html_url")
        val htmlUrl: String? = null, // https://github.com/vitalets/github-trending-repos/issues/92#issuecomment-2048626495
        @SerializedName("id")
        val id: Int? = null, // 2048626495
        @SerializedName("issue_url")
        val issueUrl: String? = null, // https://api.github.com/repos/vitalets/github-trending-repos/issues/92
        @SerializedName("node_id")
        val nodeId: String? = null, // IC_kwDOBoFvbc56G48_
        @SerializedName("performed_via_github_app")
        val performedViaGithubApp: Any? = null, // null
        @SerializedName("reactions")
        val reactions: Reactions? = null,
        @SerializedName("updated_at")
        val updatedAt: String? = null, // 2024-04-11T00:07:27Z
        @SerializedName("url")
        val url: String? = null, // https://api.github.com/repos/vitalets/github-trending-repos/issues/comments/2048626495
        @SerializedName("user")
        val user: User? = null
    ) {
        data class Reactions(
            @SerializedName("confused")
            val confused: Int? = null, // 0
            @SerializedName("eyes")
            val eyes: Int? = null, // 0
            @SerializedName("heart")
            val heart: Int? = null, // 0
            @SerializedName("hooray")
            val hooray: Int? = null, // 0
            @SerializedName("laugh")
            val laugh: Int? = null, // 0
            @SerializedName("rocket")
            val rocket: Int? = null, // 0
            @SerializedName("total_count")
            val totalCount: Int? = null, // 0
            @SerializedName("url")
            val url: String? = null, // https://api.github.com/repos/vitalets/github-trending-repos/issues/comments/2048626495/reactions
        )

        data class User(
            @SerializedName("avatar_url")
            val avatarUrl: String? = null, // https://avatars.githubusercontent.com/u/33298198?v=4
            @SerializedName("events_url")
            val eventsUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/events{/privacy}
            @SerializedName("followers_url")
            val followersUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/followers
            @SerializedName("following_url")
            val followingUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/following{/other_user}
            @SerializedName("gists_url")
            val gistsUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/gists{/gist_id}
            @SerializedName("gravatar_id")
            val gravatarId: String? = null,
            @SerializedName("html_url")
            val htmlUrl: String? = null, // https://github.com/github-trending-repos-bot
            @SerializedName("id")
            val id: Int? = null, // 33298198
            @SerializedName("login")
            val login: String? = null, // github-trending-repos-bot
            @SerializedName("node_id")
            val nodeId: String? = null, // MDQ6VXNlcjMzMjk4MTk4
            @SerializedName("organizations_url")
            val organizationsUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/orgs
            @SerializedName("received_events_url")
            val receivedEventsUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/received_events
            @SerializedName("repos_url")
            val reposUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/repos
            @SerializedName("site_admin")
            val siteAdmin: Boolean? = null, // false
            @SerializedName("starred_url")
            val starredUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/starred{/owner}{/repo}
            @SerializedName("subscriptions_url")
            val subscriptionsUrl: String? = null, // https://api.github.com/users/github-trending-repos-bot/subscriptions
            @SerializedName("type")
            val type: String? = null, // User
            @SerializedName("url")
            val url: String? = null // https://api.github.com/users/github-trending-repos-bot
        )
    }
}