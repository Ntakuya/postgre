package app.externalClient.database

import org.jdbi.v3.core.Jdbi

val jdbi: Jdbi = Jdbi.create("jdbc:postgresql://localhost:5435/sample","sample","sample").installPlugins()
