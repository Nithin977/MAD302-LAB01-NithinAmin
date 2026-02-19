/**
 * Course: W2026 MAD302-01 Android Development
 * Lab: LAB 1
 * Name: Nithin Amin
 * Student ID: a00194332
 * Date: February 19, 2026
 *
 * Description:
 * Data class used to store profile information (name and age).
 */

package com.example.profilelistapp

/**
 * Represents a single profile.
 *
 * @param name The person's name.
 * @param age The person's age.
 */
data class Profile(
    val name: String,
    val age: Int
)
