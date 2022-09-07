package com.udacity.shoestore.uis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {
    lateinit var binding: LoginFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LoginFragmentBinding.inflate(inflater, container, false)

        binding.buttonLogin.setOnClickListener{
        findNavController().navigate()
        }
        return binding.root

    }
}