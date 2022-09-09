package com.udacity.shoestore.modules

import android.widget.EditText
import androidx.databinding.InverseMethod

object Converter {
    @InverseMethod("stringToSize")
    @JvmStatic
    fun sizeToString(
        value: Double
    ): String {
        // Converts double to String.
        return value.toString()
    }

    @JvmStatic
    fun stringToSize(
        value: String
    ): Double {
        // Converts String to double.
        return value.toDouble()
    }
}