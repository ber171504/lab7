package com.example.bertherlab.Activities


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bertherlab.Models.InventoryAdapter
import com.example.bertherlab.Models.MyApplication
import com.example.bertherlab.R
import kotlinx.android.synthetic.main.fragment_collection.*


class CollectionFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_collection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addInventoryButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toNewInventory))

        collectionRecyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val adapter = InventoryAdapter(MyApplication.coleccion.invetories)

        collectionRecyclerView.adapter = adapter
    }


}
