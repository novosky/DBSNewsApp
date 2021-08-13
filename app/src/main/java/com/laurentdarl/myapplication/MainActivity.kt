package com.laurentdarl.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.laurentdarl.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        val navController = navHostFragment.navController

        appBarConfiguration = AppBarConfiguration(navController.graph, binding.drawer)
        setUpActionBar(navController)

//      Bottom navigation
        binding.bottomNav.setupWithNavController(navController)

//      Drawer navigation
        NavigationUI.setupWithNavController(binding.navView, navController)
    }


    private fun setUpActionBar(navController: NavController) {

        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawer)

    }


    override fun onSupportNavigateUp(): Boolean {

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment
        val navController = navHostFragment.navController

        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}