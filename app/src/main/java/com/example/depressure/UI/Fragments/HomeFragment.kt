package com.example.depressure.UI.Fragments

import android.annotation.SuppressLint
import android.app.Fragment
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.navigation.Navigation
import com.example.depressure.R
import com.example.depressure.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding= FragmentHomeBinding.inflate(layoutInflater,container, false)

        binding.btnAddNote.setOnClickListener{
         Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_createNoteFragment)

        }

        return binding.root

    }


}