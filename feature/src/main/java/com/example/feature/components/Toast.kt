package com.example.feature.components

import android.content.Context
import android.widget.Toast

fun Toast(context : Context, message : String) {
   Toast.makeText(context, message, Toast.LENGTH_LONG).show()
}