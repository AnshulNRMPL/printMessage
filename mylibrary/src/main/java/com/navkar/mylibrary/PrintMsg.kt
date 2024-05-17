package com.navkar.mylibrary

import android.content.Context
import android.widget.Toast

object PrintMsg {
    fun print(context: Context, str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }
}