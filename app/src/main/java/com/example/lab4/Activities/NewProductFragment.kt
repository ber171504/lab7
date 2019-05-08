package com.example.lab4.Activities


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.lab4.Models.Fila
import com.example.lab4.Models.MyApplication
import com.example.lab4.Models.Producto
import com.example.lab4.R
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.fragment_new_product.*


class NewProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        backButton.setOnClickListener(Navigation.createNavigateOnClickListener(com.example.lab4.R.id.toInventory))

        saveButton.setOnClickListener{
            if (nameText.text.toString() != "" && codeText.text != ""){
                val product = Producto(nameText.text.toString(), codeText.text.toString())
                val fila = Fila(product,0)
                MyApplication.inventario.elements.add(fila)
                it.findNavController().navigate(com.example.lab4.R.id.toInventory)
                Toast.makeText(context, "Se ha agregado el producto con exito!",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Llenar los datos.", Toast.LENGTH_SHORT).show()
            }
        }

        scan_button.setOnClickListener{

            val scanner = IntentIntegrator(this.activity)

            scanner.initiateScan()
        }

        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            if (resultCode == Activity.RESULT_OK){
                val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
                if (result != null) {
                    if (result.contents == null) {
                        Toast.makeText(context, "Cancelled", Toast.LENGTH_LONG).show()
                    } else {
                        codeText.text = result.contents
                        Toast.makeText(context, "Scanned: " + result.contents, Toast.LENGTH_LONG).show()
                    }
                } else {
                    super.onActivityResult(requestCode, resultCode, data)
                }
            }
        }
    }

}
