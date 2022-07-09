package com.learnacad.feature_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learnacad.feature_02.databinding.ActivityFeature02Binding

class Feature02Activity : AppCompatActivity() {

    private lateinit var binding: ActivityFeature02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeature02Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}