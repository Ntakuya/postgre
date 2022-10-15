package app.externalClient.database

import org.jdbi.v3.core.Jdbi
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.jdbi.v3.core.kotlin.KotlinPlugin
import org.jdbi.v3.jackson2.Jackson2Config

val jdbi: Jdbi = Jdbi
    .create("jdbc:postgresql://localhost:5432/sample","sample","sample")
    .installPlugin(KotlinPlugin())
    .apply {
        getConfig(Jackson2Config::class.java).mapper = jacksonObjectMapper()
    }
