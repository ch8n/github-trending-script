plugins {
    kotlin("jvm") version "1.9.23"
    id("com.github.gmazzo.buildconfig")
}

group = "dev.ch8n"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")
    implementation("com.google.code.gson:gson:2.10.1")
}

tasks.test {
    useJUnitPlatform()
}

buildConfig {
    buildConfigField("Github_Access_Token", extra["github.token"] as String)
}