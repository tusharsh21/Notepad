package com.example.depressure.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.depressure.dao.notesDao

abstract class notedatabase : RoomDatabase() { // abstract class functions don't have any body

    abstract fun myDao(): notesDao //getting the function returned to noteDao, class already present under Dao package
    // through this we import Dao to our database

    companion object { // this is used to declare static object

        @Volatile // Volatile means that the given instance is easily accessible
        var INSTANCE: notedatabase? = null

        fun getdatabseInstance(context: Context): notedatabase //returns notedatabase instance
        {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this)
            {
                val roomdatabaseInstance =
                    Room.databaseBuilder(context, notedatabase::class.java, "Notes").build()

                INSTANCE = roomdatabaseInstance
                return return roomdatabaseInstance

            }


        }
    }


}