package com.example.bertherlab.Models.Producto

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.example.bertherlab.Models.Inventario.Inventario
import com.example.bertherlab.Models.Inventario.InventarioDao

class ProductRepository(application: Application) {

//    private var productoDao: ProductoDao
//
//    private var allProducts: LiveData<List<Producto>>
//
//    init {
//        val database: ProductoDatabase = ProductoDatabase.getInstance(
//            application.applicationContext
//        )!!
//        productoDao = database.productoDao()
//        allProducts = productoDao.getAllProducts()
//    }
//
//    fun insert(producto: Producto) {
//        val insertProductAsyncTask = Companion.InsertProductAsyncTask(
//            productoDao
//        ).execute(producto)
//    }
//
//    fun update(producto: Producto) {
//        val updateProductAsyncTask = Companion.UpdateProductAsyncTask(
//            productoDao
//        ).execute(producto)
//    }
//
//
//    fun delete(producto: Producto) {
//        val deleteProductAsyncTask = Companion.DeleteProductAsyncTask(
//            productoDao
//        ).execute(producto)
//    }
//
//    fun deleteAllContacts() {
//        val deleteAllProductAsyncTask = DeleteAllProductsAsyncTask(
//            productoDao
//        ).execute()
//    }
//
//    fun getAllProducts(): LiveData<List<Producto>> {
//        return allProducts
//    }
//
//
//    companion object {
//
//        private class InsertProductAsyncTask(productoDao: ProductoDao) : AsyncTask<Producto, Unit, Unit>() {
//            val productoDao = productoDao
//
//            override fun doInBackground(vararg p0: Producto?) {
//                productoDao.insert(p0[0]!!)
//            }
//        }
//
//        private class UpdateProductAsyncTask(productoDao: ProductoDao) : AsyncTask<Producto, Unit, Unit>() {
//            val productoDao = productoDao
//
//            override fun doInBackground(vararg p0: Producto?) {
//                productoDao.update(p0[0]!!)
//            }
//        }
//
//        private class DeleteProductAsyncTask(productoDao: ProductoDao) : AsyncTask<Producto, Unit, Unit>() {
//            val productoDao = productoDao
//
//            override fun doInBackground(vararg p0: Producto?) {
//                productoDao.delete(p0[0]!!)
//            }
//        }
//
//        private class DeleteAllProductsAsyncTask(productoDao: ProductoDao) : AsyncTask<Unit, Unit, Unit>() {
//            val productoDao = productoDao
//
//            override fun doInBackground(vararg p0: Unit?) {
//                productoDao.deleteAllProducts()
//            }
//        }
//    }
}