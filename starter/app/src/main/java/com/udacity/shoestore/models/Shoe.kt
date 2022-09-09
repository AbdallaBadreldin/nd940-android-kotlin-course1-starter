package com.udacity.shoestore.models

import android.os.Parcelable
import android.widget.EditText
import androidx.databinding.InverseMethod
import kotlinx.parcelize.Parcelize

@Parcelize
data class Shoe(
    var name: String, var size: Double, var company: String, var description: String,
    val images: List<String> = mutableListOf()
) : Parcelable
{
    /*fun setSize(size:String){
        this.size=size.toDouble()
    }

    fun getSize():String{
        return size.toString()
    }
*/

}
/*

object Converter {
    @InverseMethod("stringToSize")
    @JvmStatic
    fun sizeToString(
        view: EditText, oldValue: Double,
        value: Double
    ): String {
        // Converts double to String.
        return value.toString()
    }

    @JvmStatic
    fun stringToSize(
        view: EditText, oldValue: String,
        value: String
    ): Double {
        // Converts String to double.
        return value.toDouble()
    }
}
*/
