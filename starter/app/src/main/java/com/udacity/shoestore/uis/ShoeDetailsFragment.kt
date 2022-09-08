package com.udacity.shoestore.uis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShowDetailsFragmentBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.viewmodels.AppViewModel


class ShoeDetailsFragment : Fragment() {
    lateinit var binding: ShowDetailsFragmentBinding
    lateinit var viewModel: AppViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ShowDetailsFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(requireActivity())[AppViewModel::class.java]

        viewModel.shoeList.observe(viewLifecycleOwner) {
            clearLinearLayout()
            renderListToLayout(it)
        }

        binding.fab.setOnClickListener {
            findNavController().navigate(R.id.goto_shoeAddFragment_from_shoeDetailsFragment)
        }
        return binding.root
    }

    private fun renderListToLayout(listOfShoes: MutableList<Shoe>) {
        for (shoe in listOfShoes) {
            binding.linearLayout.addView(createLayout(shoe))
        }
    }

    private fun createLayout(shoe: Shoe): LinearLayout {
        val params = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val text1 = TextView(context)
        text1.text = shoe.name
        text1.layoutParams = params

        val text2 = TextView(context)
        text2.text = shoe.size.toString()
        text2.layoutParams = params

        val text3 = TextView(context)
        text3.text = shoe.company
        text3.layoutParams = params

        val text4 = TextView(context)
        text4.text = shoe.description
        text4.layoutParams = params

        val linearLayout = LinearLayout(context)
        linearLayout.layoutParams = params
        linearLayout.orientation = LinearLayout.VERTICAL

        linearLayout.addView(text1)
        linearLayout.addView(text2)
        linearLayout.addView(text3)
        linearLayout.addView(text4)

//        val linearLayoutParams = linearLayout.layoutParams as LinearLayout.LayoutParams
//        linearLayoutParams.setMargins(16, 0, 16, 16)
//        linearLayout.layoutParams = params
//        linearLayout.layoutParams = linearLayoutParams

        return linearLayout
    }

    private fun clearLinearLayout() {
        binding.linearLayout.removeAllViews()
    }
}