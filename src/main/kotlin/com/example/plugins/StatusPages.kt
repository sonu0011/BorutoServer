package com.example.plugins

import com.example.models.ApiResponse
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*

fun Application.configureStatusPages() {

    install(StatusPages) {
        status(HttpStatusCode.NotFound) {
            val apiResponse = ApiResponse(success = false, message = "Page not Found.")
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.NotFound
            )
        }
    }
}