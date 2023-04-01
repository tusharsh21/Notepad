package com.example.depressure.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Notes")

class notes (

    @PrimaryKey(autoGenerate = true)

           var id: Int? = null,
           var title: String,
           var subtitle: String,
           var notes: String,
           var date: String,
           var priority: String,
    )

//entity is complete now moving to DAO