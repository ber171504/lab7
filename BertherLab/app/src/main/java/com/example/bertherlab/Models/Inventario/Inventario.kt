package com.example.bertherlab.Models.Inventario

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.bertherlab.Models.Fila

class Inventario (var fecha: String, var name: String) {
    var elements = ArrayList<Fila>()


    override fun toString(): String {
        var result:String = ""
        for (element: Fila in elements){
            result += """
                Nombre: ${element.product.name}
                Cantidad: ${element.quantity}
            """.trimIndent()
        }
        return result
    }
}