package app.infrastructure.course

import app.domain.course.Course
import org.jdbi.v3.core.Handle
import kotlinx.datetime.LocalDate

object CourseRepository {
    fun getAllCourses(handle: Handle): List<Course> {
        val sql = """
            SELECT course_id, course_name, description
            FROM courses
        """.trimIndent()

        return handle
            .createQuery(sql)
            .mapTo(Row::class.java)
            .map{ it.toCourse() }
            .list()
    }

    data class Row(
        val course_id: Int,
        val course_name: String,
        val description: String,
    ) {
        fun toCourse(): Course {
            return Course(course_id, course_name, description)
        }
    }
}
