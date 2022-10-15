val ktor_version: String by project;
val kotlin_version: String by project;
val flyway_version: String by project;
val logback_version: String by project;


plugins {
    kotlin("jvm") version "1.7.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.20"
    id("org.flywaydb.flyway") version "9.4.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("org.postgresql:postgresql:42.2.14")
    implementation("org.postgresql:postgresql:42.2.12")
    implementation("org.jdbi:jdbi3-sqlobject:3.20.0")
    implementation("io.ktor:ktor-server-core:2.1.2")
    implementation("io.ktor:ktor-server-netty:2.1.2")
    implementation("org.slf4j:slf4j-nop:1.7.25")
    implementation("io.ktor:ktor-server-content-negotiation:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
    implementation("io.ktor:ktor-server-cors:$ktor_version")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.+")
    // https://mvnrepository.com/artifact/org.jdbi/jdbi3-kotlin-sqlobject
    implementation("org.jdbi:jdbi3-kotlin-sqlobject:3.9.1")
    // https://mvnrepository.com/artifact/org.jdbi/jdbi3-kotlin
    implementation("org.jdbi:jdbi3-kotlin:3.34.0")
    // https://mvnrepository.com/artifact/org.jdbi/jdbi3-jackson2
    implementation("org.jdbi:jdbi3-jackson2:3.34.0")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClass.set("app.AppKt")
}

flyway {
  driver = "org.postgresql.Driver"
  url = "jdbc:postgresql://0.0.0.0:5432/sample"
  user = "sample"
  password = "sample"
}
