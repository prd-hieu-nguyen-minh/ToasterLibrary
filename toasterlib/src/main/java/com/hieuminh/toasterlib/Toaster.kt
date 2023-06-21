package com.hieuminh.toasterlib

import android.content.Context
import android.widget.Toast

object Toaster {
    fun showToast(context: Context?, message: String) {
        if (context == null) {
            return
        }
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}
