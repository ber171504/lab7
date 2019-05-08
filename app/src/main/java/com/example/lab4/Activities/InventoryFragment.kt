package com.example.lab4.Activities


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation
import com.example.lab4.Models.MyApplication
import com.example.lab4.Models.ProductAdapter
import com.example.lab4.R
import kotlinx.android.synthetic.main.fragment_inventory.*


class InventoryFragment : Fragment() {

    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inventory, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addProductButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toNewProduct))

        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL,false)

        val adapter = ProductAdapter(MyApplication.inventario.elements)

        recyclerView.adapter = adapter
    }


}
