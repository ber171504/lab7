package com.example.bertherlab.Models.Inventario

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData

class InventarioRepository(application: Application) {

//    private var inventarioDao: InventarioDao
//
//    private var allInventories: LiveData<List<Inventario>>
//
//    init {
//        val database: InventarioDatabase = InventarioDatabase.getInstance(
//            application.applicationContext
//        )!!
//        inventarioDao = database.inventarioDao()
//        allInventories = inventarioDao.getAllInventories()
//    }
//
//    fun insert(inventario: Inventario) {
//        val insertInventoryAsyncTask = InsertInventoryAsyncTask(inventarioDao).execute(inventario)
//    }
//
//    fun update(inventario: Inventario) {
//        val updateInventoryAsyncTask = UpdateInventoryAsyncTask(inventarioDao).execute(inventario)
//    }
//
//
//    fun delete(inventario: Inventario) {
//        val deleteInventoryAsyncTask = DeleteInventoryAsyncTask(inventarioDao).execute(inventario)
//    }
//
//    fun deleteAllInventories() {
//        val deleteAllInventoriesAsyncTask = DeleteAllInventoriesAsyncTask(
//            inventarioDao
//        ).execute()
//    }
//
//    fun getAllInventories(): LiveData<List<Inventario>> {
//        return allInventories
//    }
//
//
//    companion object {
//
//        private class InsertInventoryAsyncTask(inventarioDao: InventarioDao) : AsyncTask<Inventario, Unit, Unit>() {
//            val inventarioDao = inventarioDao
//
//            override fun doInBackground(vararg p0: Inventario?) {
//                inventarioDao.insert(p0[0]!!)
//            }
//        }
//
//        private class UpdateInventoryAsyncTask(inventarioDao: InventarioDao) : AsyncTask<Inventario, Unit, Unit>() {
//            val inventarioDao = inventarioDao
//
//            override fun doInBackground(vararg p0: Inventario?) {
//                inventarioDao.update(p0[0]!!)
//            }
//        }
//
//        private class DeleteInventoryAsyncTask(inventarioDao: InventarioDao) : AsyncTask<Inventario, Unit, Unit>() {
//            val inventarioDao = inventarioDao
//
//            override fun doInBackground(vararg p0: Inventario?) {
//                inventarioDao.delete(p0[0]!!)
//            }
//        }
//
//        private class DeleteAllInventoriesAsyncTask(inventarioDao: InventarioDao) : AsyncTask<Unit, Unit, Unit>() {
//            val invetarioDao = inventarioDao
//
//            override fun doInBackground(vararg p0: Unit?) {
//                invetarioDao.deleteAllInventories()
//            }
//        }
//    }
}