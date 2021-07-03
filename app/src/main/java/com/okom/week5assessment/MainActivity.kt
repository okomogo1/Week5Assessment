package com.okom.week5assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.okom.week5assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private lateinit var myprofileAdapter:ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name :List<ProfileModel> = listOf(
            ProfileModel(
                "BARACK","OBAMA", true),
            ProfileModel( "donald", "TRUMP", false),
            ProfileModel( "president", "TRUMP", false)

        )
    }
}