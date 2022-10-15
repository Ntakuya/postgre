package app.domain.person

import kotlin.random.Random

data class Person(
    val id: Int,
    val name: String
) {
    companion object {
        fun of(
            name: String
        ): Person {
            return Person(generateUUID() , name)
        }

        private fun generateUUID(): Int {
            return Random.nextInt(0, 100)
        }
    }
}
