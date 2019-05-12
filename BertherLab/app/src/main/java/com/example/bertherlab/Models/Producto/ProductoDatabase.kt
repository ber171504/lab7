package com.example.bertherlab.Models.Producto

import android.content.Context
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

//@Database(entities = [Producto::class], version = 1)
abstract class ProductoDatabase  /*RoomDatabase() */ {

//    abstract fun productoDao(): ProductoDao
//
//
//    companion object {
//        private var instance: ProductoDatabase? = null
//
//        fun getInstance(context: Context): ProductoDatabase? {
//            if (instance == null) {
//                synchronized(ProductoDatabase::class) {
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        ProductoDatabase::class.java, "products_database"
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
//    class PopulateDbAsyncTask(db: ProductoDatabase?) : AsyncTask<Unit, Unit, Unit>() {
//        private val productoDao = db?.productoDao()
//
//        override fun doInBackground(vararg p0: Unit?) {
//
//        }
//    }

}