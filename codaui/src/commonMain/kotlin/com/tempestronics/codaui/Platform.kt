package com.tempestronics.codaui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform