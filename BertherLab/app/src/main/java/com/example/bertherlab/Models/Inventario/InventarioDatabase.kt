package com.example.bertherlab.Models.Inventario

import android.content.Context
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

//@Database(entities = [Inventario::class], version = 1)
abstract class InventarioDatabase /*: RoomDatabase() */ {

//    abstract fun inventarioDao(): InventarioDao
//
//
//    companion object {
//        private var instance: InventarioDatabase? = null
//
//        fun getInstance(context: Context): InventarioDatabase? {
//            if (instance == null) {
//                synchronized(InventarioDatabase::class) {
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        InventarioDatabase::class.java, "inventaries_database"
//                    )
//                        .fallbackToDestructiveMigration()
//                        .addCallback(roomCallback)
//                        .build()
//                }
//            }
//            return instance
//        }
//
//        fun destroyInstance() {
//            instance = null
//        }
//
//        private val roomCallback = object : RoomDatabase.Callback() {
//            override fun onCreate(db: SupportSQLiteDatabase) {
//                super.onCreate(db)
//                PopulateDbAsyncTask(instance)
//                    .execute()
//            }
//        }
//    }
//
//    class PopulateDbAsyncTask(db: InventarioDatabase?) : AsyncTask<Unit, Unit, Unit>() {
//        private val inventaryDao = db?.inventarioDao()
//
//        override fun doInBackground(vararg p0: Unit?) {
//
//        }
//    }

}