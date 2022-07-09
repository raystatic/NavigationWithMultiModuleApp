package com.raystatic.navigationwithmultimoduleapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raystatic.core.navigation.DeeplinkHandler
import com.raystatic.navigationwithmultimoduleapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var deeplinkHandler: DeeplinkHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent?.let {
            handleIntent(it)
        }

        binding.btnGoto.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("raystatic://multi.module.app/feat01"))
            startActivity(intent)
        }

    }

    private fun handleIntent(intent: Intent) {
        intent.data?.toString()?.let {
            deeplinkHandler.process(it)
            finish()
        }
    }
}