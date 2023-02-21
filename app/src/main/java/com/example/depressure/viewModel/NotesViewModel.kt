package com.example.depressure.viewModel

import android.app.Application
import android.provider.ContactsContract
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.depressure.database.notedatabase
import com.example.depressure.model.notes
import com.example.depressure.model.repository.Notesrepository


class NotesViewModel(application: Application) : AndroidViewModel(application) {

        val repository: Notesrepository

        init{ //runs the code inside this first

            val dao = notedatabase.getdatabseInstance(application).myDao()
            repository=Notesrepository(dao)
        }

    fun addNotes(notes: notes)
    {
        repository.insertnotes(notes)
    }

    fun getNotes(): LiveData<List<ContactsContract.CommonDataKinds.Note>> = repository.getallnotes()

    fun deleteNotes(id: Int)
    {
        repository.deletenotes(id)
    }

    fun updateNotes(notes: notes)
    {
        repository.updatenotes(notes)
    }


}
