package com.navkar.mylibrary

import android.content.Context
import android.widget.Toast

class PrintMessage {
    fun print(context: Context, str: String) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show()
    }

    fun getGreeting(): String {
        return "Hello, World!"
    }
}