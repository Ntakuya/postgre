val ktor_version: String by project;
val kotlin_version: String by project;
val flyway_version: String by project;
val logback_version: String by project;


plugins {
    kotlin("jvm") version "1.7.20"
    id("org.flywaydb.flyway") version "9.3.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:31.0.1-jre")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClass.set("app.AppKt")
}
