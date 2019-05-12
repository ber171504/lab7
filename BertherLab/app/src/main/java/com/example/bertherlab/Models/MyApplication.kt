package com.example.bertherlab.Models

import android.app.Application
import androidx.room.Entity
import com.example.bertherlab.Models.Inventario.Inventario

@Entity
internal class MyApplication : Application() {

    companion object {
        var coleccion = Collection()

        lateinit var inventario: Inventario
    }
}