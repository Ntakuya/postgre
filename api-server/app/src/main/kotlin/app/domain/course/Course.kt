package app.domain.course

import kotlinx.serialization.Serializable

@Serializable
data class Course(
    val courseId: Int,
    val courseName: String,
    val description: String
)
