package com.udacity.shoestore

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.udacity.shoestore.databinding.ActivityMainBinding
import com.udacity.shoestore.viewmodels.AppViewModel
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: AppViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Timber.plant(Timber.DebugTree())
        viewModel = ViewModelProvider(this)[AppViewModel::class.java]
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController

    }
}
