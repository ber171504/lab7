package com.example.bertherlab.Activities


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.bertherlab.Models.MyApplication
import com.example.bertherlab.R
import com.example.bertherlab.Models.Inventario.Inventario
import kotlinx.android.synthetic.main.fragment_new_inventory.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class NewInventoryFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_inventory, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss")

        dateText.text = current.format(formatter)

        newInventoryBackButton.setOnClickListener(Navigation.createNavigateOnClickListener(com.example.bertherlab.R.id.toCollection))

        saveInventoryButton.setOnClickListener{
            if (inventoryNameText.text.toString() != "" && dateText.text != ""){
                val inventory = Inventario(
                    dateText.text.toString(),
                    inventoryNameText.text.toString()
                )
                MyApplication.coleccion.invetories.add(inventory)
                it.findNavController().navigate(com.example.bertherlab.R.id.toCollection)
                Toast.makeText(context, "Se ha agregado el inventario con exito!",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Llenar los datos.", Toast.LENGTH_SHORT).show()
            }
        }
    }

}