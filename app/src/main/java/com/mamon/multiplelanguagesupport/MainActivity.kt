package com.mamon.multiplelanguagesupport

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil.setContentView
import com.mamon.mutiplelanguagesupport.R
import com.mamon.mutiplelanguagesupport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_main)

    }


    // for displaying the last language that you are saved on UI
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase)
        setAppLocale(getLastUpdateLang())
    }



}