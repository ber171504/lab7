package com.example.bertherlab.Models

import androidx.room.Entity
import com.example.bertherlab.Models.Inventario.Inventario

@Entity (tableName = "collection_table")
class Collection {
    //Contiene una lista con todos los inventarios.
    var invetories = ArrayList<Inventario>()
}