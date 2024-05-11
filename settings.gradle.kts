pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
        id("com.github.gmazzo.buildconfig").version("5.3.5")
    }
}

rootProject.name = "GithubTrends"
