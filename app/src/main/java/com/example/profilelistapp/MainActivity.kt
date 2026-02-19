/**
 * Course: W2026 MAD302-01 Android Development
 * Lab: LAB 1
 * Name: Nithin Amin
 * Student ID: a00194332
 * Date: February 19, 2026
 *
 * Description:
 * This app allows users to enter a name and age.
 * When "Add Profile" is clicked:
 * 1. A Profile object is created.
 * 2. It is added to a mutable list.
 * 3. All profiles are displayed using a for loop.
 * Lifecycle methods are logged.
 */

package com.example.profilelistapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Main activity handling UI interactions and lifecycle logging.
 */
class MainActivity : AppCompatActivity() {

    // Mutable list storing profiles
    private val profiles = mutableListOf<Profile>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Lifecycle", "onCreate called")

        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvProfiles = findViewById<TextView>(R.id.tvProfiles)

        btnAdd.setOnClickListener {

            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()

            val profile = Profile(name, age)
            profiles.add(profile)

            // Cleaner display using StringBuilder
            val sb = StringBuilder()

            for (p in profiles) {
                sb.append("${p.name} – ${p.age}\n")
            }

            tvProfiles.text = sb.toString().trim()

            etName.text.clear()
            etAge.text.clear()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy called")
    }
}
