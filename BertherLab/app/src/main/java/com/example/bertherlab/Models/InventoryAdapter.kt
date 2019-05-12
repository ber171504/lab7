package com.example.bertherlab.Models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.bertherlab.Models.Inventario.Inventario
import com.example.bertherlab.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

public class InventoryAdapter (val inventoryList: ArrayList<Inventario>): androidx.recyclerview.widget.RecyclerView.Adapter<InventoryAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.coleccion_item, p0, false)
        return ViewHolder(view )
    }

    override fun getItemCount(): Int {
        return inventoryList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val inventory: Inventario = inventoryList[p1]

        p0.inventoryName.text = inventory.name.toString()
        p0.inventoryDate.text = inventory.fecha.toString()

        p0.inventorySelection.setOnClickListener{
            println("inventorySelection")
            MyApplication.inventario = inventory
            it.findNavController().navigate(com.example.bertherlab.R.id.toInventory)
        }

    }

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView){
        val inventoryName = itemView.findViewById<TextView>(R.id.text_view_Ctitle)
        val inventoryDate = itemView.findViewById<TextView>(R.id.date_text_view)
        val inventorySelection = itemView.findViewById<FloatingActionButton>(R.id.selectButton)
    }

}