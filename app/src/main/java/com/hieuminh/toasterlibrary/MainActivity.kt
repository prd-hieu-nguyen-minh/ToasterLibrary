package com.hieuminh.toasterlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hieuminh.toasterlib.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.showToast(this, "ABCzdfsdf sdf sdff sdf sdf sdf")
    }
}
