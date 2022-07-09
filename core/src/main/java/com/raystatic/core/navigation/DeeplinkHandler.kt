package com.raystatic.core.navigation

interface DeeplinkHandler {
    fun process(deeplink: String): Boolean
}