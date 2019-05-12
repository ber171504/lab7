package com.example.bertherlab.Models

import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bertherlab.R

public class ProductAdapter (val productList: ArrayList<Fila>): androidx.recyclerview.widget.RecyclerView.Adapter<ProductAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.inventory_item, p0, false)
        return ViewHolder(view )
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val product: Fila = productList[p1]

        p0.productoName.text = product.product.name
        p0.productQuantity.text = product.quantity.toString()

        p0.addButton.setOnClickListener{
            product.quantity++
            p0.productQuantity.text = product.quantity.toString()
        }

        p0.substractButton.setOnClickListener{
            product.quantity--
            p0.productQuantity.text = product.quantity.toString()
        }
    }

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView){
        val productoName = itemView.findViewById(R.id.text_view_title) as TextView
        val productQuantity = itemView.findViewById(R.id.date_text_view) as TextView
        val substractButton = itemView.findViewById(R.id.substractButton) as FloatingActionButton
        val addButton = itemView.findViewById(R.id.addButton) as FloatingActionButton
    }

}