package com.example.routes

import com.example.reposiroty.TestRepo
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.testRoute(
    repository: TestRepo
){
    get("/api/test"){
        repository.addSomethingInDb()

        call.respondText { "Success" }
    }
}