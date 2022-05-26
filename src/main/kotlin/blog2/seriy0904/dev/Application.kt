package blog2.seriy0904.dev

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import blog2.seriy0904.dev.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
