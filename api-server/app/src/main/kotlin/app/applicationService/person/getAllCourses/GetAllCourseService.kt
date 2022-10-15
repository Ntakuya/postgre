package app.applicationService.person.getAllCourses

import app.domain.course.Course
import app.externalClient.database.jdbi
import app.infrastructure.course.CourseRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object GetAllCourseService {
    suspend fun getAllCourses(): List<Course> {
        val result = withContext(Dispatchers.IO) {
            jdbi.withHandle<List<Course>, Exception> {handle ->
                CourseRepository.getAllCourses(handle)
            }
        }
        return result
    }
}
