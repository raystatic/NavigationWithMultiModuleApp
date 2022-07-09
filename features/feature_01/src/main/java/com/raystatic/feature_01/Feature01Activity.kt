package com.raystatic.feature_01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raystatic.feature_01.databinding.ActivityFeature01Binding

class Feature01Activity : AppCompatActivity() {

    private lateinit var binding: ActivityFeature01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoto.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("raystatic://multi.module.app/feat02"))
            startActivity(intent)
        }

    }
}