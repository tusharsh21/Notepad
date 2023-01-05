package com.example.depressure.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.depressure.R
import com.example.depressure.databinding.ActivityMainBinding.inflate
import com.example.depressure.databinding.ActivitySplashScrennBinding.inflate
import com.example.depressure.databinding.FragmentCreateNoteBinding
import com.example.depressure.databinding.FragmentHomeBinding


class CreateNoteFragment : Fragment() {

    lateinit var binding: FragmentCreateNoteBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCreateNoteBinding.inflate(layoutInflater, container, false)


        // Inflate the layout for this fragment
        return binding.root
    }

}