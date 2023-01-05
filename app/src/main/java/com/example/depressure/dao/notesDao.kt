package com.example.depressure.dao

import android.provider.ContactsContract
import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.depressure.UI.Fragments.EditNotesFragmentDirections
import com.example.depressure.model.notes


@Dao
interface notesDao {

    @Query(value = "SELECT * FROM Notes")
    fun getnotes() : LiveData<List<Note>> // through this we get the notes

    // in all other queries used here, we don't get anything as output only action
    // is taken according to the function

    @Insert(onConflict = OnConflictStrategy.REPLACE ) // if we get same query we replace by onconf lict
    fun insertnotes(notes: Note) //this will give us a parameter as a notes


    @Query(value = "DELETE FROM Notes WHERE id=:") // Custom query for deleting notes
    fun deletenotes(id: Int)

    @Update
    fun updatenotes(notes: Note)




}