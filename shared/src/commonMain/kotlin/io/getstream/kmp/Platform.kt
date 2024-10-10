package io.getstream.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform