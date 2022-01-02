package com.afauzi.restfulApi

import com.afauzi.restfulApi.customer.registerCustomerRoutes
import com.afauzi.restfulApi.order.registerOrderRoutes
import com.typesafe.config.ConfigFactory
import io.ktor.application.*
import io.ktor.client.*
import io.ktor.client.engine.jetty.*
import io.ktor.config.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*


fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1") {
        configureRouting()
    }.start(wait = true)
}

fun Application.configureRouting() {

    install(ContentNegotiation) {
        gson()
        json()
    }
    install(CORS) {
        anyHost()
    }
    HttpClient(Jetty)
    routing {
        registerCustomerRoutes()
        registerOrderRoutes()

        get("/") {
                call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
        }
    }
}


//fun Application.module(testing: Boolean = false) {
//    install(ContentNegotiation) {
//        gson {
//
//        }
//        json()
//    }
//
//    HttpClient(Jetty) {
//    }
//
//
//}



