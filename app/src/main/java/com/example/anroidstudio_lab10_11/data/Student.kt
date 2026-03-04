package com.example.anroidstudio_lab10_11.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Student (
    @DrawableRes
    val imageResourceId: Int,
    @StringRes
    val name: Int,
    val age: Int,
    @StringRes val description: Int
)