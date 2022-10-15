package app.infrastructure.person

import app.domain.person.Person
import org.jdbi.v3.core.Handle
import org.jdbi.v3.core.kotlin.mapTo

object PersonRepository {
    fun register(handle: Handle, person: Person) {
        val sql = """
            INSERT INTO  person (id, name)
            VALUES (:id, :name)
        """.trimIndent()
        handle.createUpdate(sql)
            .bind("id", person.id)
            .bind("name", person.name)
            .execute()
    }
}
