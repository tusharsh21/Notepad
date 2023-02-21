package com.example.depressure.model.repository

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.lifecycle.LiveData
import com.example.depressure.dao.notesDao
import com.example.depressure.model.notes

class Notesrepository(val dao: notesDao) //we take dao here because we will make all the functions here using dao
{
    fun getallnotes():LiveData<List<Note>> {

         return dao.getnotes()
    }

    fun insertnotes(note: notes)
    {
       dao.insertnotes(note)
    }

    fun deletenotes(id: Int)
    {
        dao.deletenotes(id)
    }

    fun updatenotes(note: notes)
    {
        dao.updatenotes(note)
    }




}