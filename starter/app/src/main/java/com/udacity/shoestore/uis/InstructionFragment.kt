package com.udacity.shoestore.uis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.InstructionFragmentBinding

class InstructionFragment : Fragment() {
    lateinit var binding: InstructionFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = InstructionFragmentBinding.inflate(inflater, container, false)

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.goto_shoeDetailsFragment_from_instructionFragment)
        }

        requireActivity()
            .onBackPressedDispatcher
            .addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    findNavController().navigate(R.id.goto_welcomeFragment_from_instructionFragment)
                }
            }
            )
        return binding.root
    }

}