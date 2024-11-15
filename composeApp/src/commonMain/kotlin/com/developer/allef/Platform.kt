package com.developer.allef

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform