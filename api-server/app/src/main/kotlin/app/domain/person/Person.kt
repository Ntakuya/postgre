package app.domain.person

import java.util.concurrent.ThreadLocalRandom;

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
            return ThreadLocalRandom.current().nextInt(1, 2147483647 + 1)
        }
    }
}
