package dev.irving.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform