package com.example.depressure.UI.Fragments

import android.content.ActivityNotFoundException
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.text.format.DateFormat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Context
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.fragment.app.Fragment
import com.example.depressure.databinding.ActivityMainBinding
import com.example.depressure.databinding.FragmentCreateNoteBinding
import java.lang.String.format
import java.util.*


class CreateNoteFragment : Fragment() {

    lateinit var binding: FragmentCreateNoteBinding
    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCreateNoteBinding.inflate(layoutInflater, container, false)

        binding.btndonenote.setOnClickListener{
             createnotes(it)

        }

        binding.speechbtn.setOnClickListener(View.OnClickListener{
            val intent= Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
            intent.putExtra (RecognizerIntent. EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
            intent.putExtra (RecognizerIntent. EXTRA_LANGUAGE, Locale.getDefault ())
            intent.putExtra (RecognizerIntent. EXTRA_PROMPT, "Say Something....")

            try{
                activityResultLauncher.launch(intent)
            }catch (exp: ActivityNotFoundException)
            {
                Toast.makeText (context, "Device does not supported", Toast. LENGTH_SHORT) .show ()
            }
        })






        // Inflate the layout for this fragment
        return binding.root
    }

    private fun createnotes(it: View?) {

        val title= binding.edttitle.text

        val subtitle= binding.edtsubtitle.text

        val notes= binding.edtnote.text

        val d = Date()
        val s: CharSequence = DateFormat.format("MMMM d, yyyy ", d.getTime())

        Log.e(TAG, "createnotes: ", )

    }

}