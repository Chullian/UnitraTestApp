package com.chullian.app

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.toast(msg:String){
    Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
}