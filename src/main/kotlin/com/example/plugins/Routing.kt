package com.example.plugins

import com.example.reposiroty.TestRepo
import com.example.routes.testRoute
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {

    val repo : TestRepo by inject()

    routing {
        testRoute(repo)
    }
}
