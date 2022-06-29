package com.Evelyndamayantiambarita.challengchapter6.ui

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.Evelyndamayantiambarita.challengchapter6.R
import com.Evelyndamayantiambarita.challengchapter6.databinding.ActivityMainBinding
import com.Evelyndamayantiambarita.challengchapter6.datastore.pref
import com.Evelyndamayantiambarita.challengchapter6.ui.signin.SignInActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (applicationContext.pref().getPrefLogin() == false) {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        } else {
//            startActivity(Intent(this, MainActivity::class.java))
//            finish()
        }

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_favorite, R.id.navigation_notifications
            )
        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}