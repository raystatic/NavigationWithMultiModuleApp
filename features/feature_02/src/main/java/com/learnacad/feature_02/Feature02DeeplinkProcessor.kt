package com.learnacad.feature_02

import android.content.Context
import android.content.Intent
import com.raystatic.core.navigation.DeeplinkProcessor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Feature02DeeplinkProcessor @Inject constructor(
    private val context: Context
) : DeeplinkProcessor {

    override fun matches(deeplink: String): Boolean {
        return deeplink.contains("/feat02")
    }

    override fun execute(deeplink: String) {
        val intent = Intent(context, Feature02Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}