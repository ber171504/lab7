package com.example.lab4.Models

class Inventario {
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