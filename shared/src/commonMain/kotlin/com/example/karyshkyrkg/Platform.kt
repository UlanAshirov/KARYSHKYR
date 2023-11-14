package com.example.karyshkyrkg

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform