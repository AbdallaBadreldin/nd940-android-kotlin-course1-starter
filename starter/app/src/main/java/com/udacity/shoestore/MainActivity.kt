package com.udacity.shoestore

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.viewmodels.AppViewModel
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: AppViewModel
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
//        Timber.plant(Timber.DebugTree())
        viewModel = ViewModelProvider(this)[AppViewModel::class.java]

    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//
//    }
}
