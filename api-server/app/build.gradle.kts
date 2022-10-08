val ktor_version: String by project;
val kotlin_version: String by project;
val flyway_version: String by project;
val logback_version: String by project;


plugins {
    kotlin("jvm") version "1.7.20"
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
    implementation("org.jdbi:jdbi3-kotlin:3.20.0")

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
