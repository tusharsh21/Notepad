package com.example.depressure.database

import com.example.depressure.dao.notesDao

abstract class notedatabase { // abstract class functions don't have any body

     abstract fun myDao(): notesDao //getting the function returned to noteDao, class already present under Dao package
     // through this we import Dao to our database

     companion object{ // this is used to declare static object


     }





}