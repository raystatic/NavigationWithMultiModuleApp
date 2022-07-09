package com.raystatic.feature_01

import android.content.Context
import android.content.Intent
import com.raystatic.core.navigation.DeeplinkProcessor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Feature01DeeplinkProcessor @Inject constructor(
    private val context: Context
) : DeeplinkProcessor {

    override fun matches(deeplink: String): Boolean {
        return deeplink.contains("/feat01")
    }

    override fun execute(deeplink: String) {
        val intent = Intent(context, Feature01Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}