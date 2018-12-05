plugins {
    kotlin("jvm") version "1.3.10"
    id("java-gradle-plugin")
}

repositories {
    jcenter()
}

dependencies {
    compileOnly(gradleApi())
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.kohsuke:github-api:1.93")

    testCompileOnly(gradleTestKit())
    testImplementation("junit:junit:4.12")
    testImplementation("org.assertj:assertj-core:3.6.2")
}
