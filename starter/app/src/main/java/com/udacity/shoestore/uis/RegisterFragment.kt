package com.udacity.shoestore.uis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.RegisterFragmentBinding

class RegisterFragment : Fragment() {
    lateinit var binding: RegisterFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RegisterFragmentBinding.inflate(inflater, container, false)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.goto_welcomeScreen_from_registerFragment)
        }
        binding.textViewGoToLogin.setOnClickListener {
            findNavController().navigate(R.id.goto_loginFragment_from_registerFragment)
        }

        return binding.root
    }
}