package com.example.bertherlab.Models.Producto

import androidx.room.Entity
import androidx.room.PrimaryKey

data class Producto (var name: String, var code: String){


    override fun toString(): String {
        return "Name: $name, Code: $code"
    }

}