package com.raystatic.core.navigation

interface DeeplinkProcessor {
    fun matches(deeplink: String): Boolean

    fun execute(deeplink: String)
}