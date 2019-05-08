package com.example.lab4.Models

import android.app.Application

internal class MyApplication : Application() {

    companion object {
        var inventario = Inventario()
    }
}