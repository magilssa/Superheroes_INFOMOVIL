package com.example.superheroes_infomovil.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superheroes_infomovil.R

data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)
