package app

import app.applicationService.person.getAllCourses.GetAllCourseService
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(CORS) {
        anyHost()
        allowCredentials = true
        allowNonSimpleContentTypes = true
    }
    install(ContentNegotiation) {
        json()
    }
    routing {
        get("/health") {
            call.respond(GetHealthResponse("Hello aaa World!"))
        }

        get("/courses") {
            try {
                val result = GetAllCourseService.getAllCourses()
                call.respond(result)
            } catch (error: Error) {
                call.respond(GetHealthResponse("Hello aaa World!"))
            }
        }
    }
}

@kotlinx.serialization.Serializable()
data class GetHealthResponse(val message: String)