package app.applicationService.person

import app.domain.person.Person
import app.externalClient.database.jdbi
import app.infrastructure.person.PersonRepository

object RegisterPerson {
    fun register(dto: RegisterPersonDto) {
        val person = Person.of(
            name = dto.name
        )
        jdbi.useHandle<Exception> {handle ->
            PersonRepository.register(handle, person)
        }
    }
}

data class RegisterPersonDto(
    val name: String
)
