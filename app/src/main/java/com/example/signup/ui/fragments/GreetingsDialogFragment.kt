package com.example.signup.ui.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.signup.R
import com.example.signup.ui.MainActivity
import com.example.signup.ui.viewModels.SignUpViewModel
import kotlinx.android.synthetic.main.fragment_greetings_dialog.*
import kotlinx.android.synthetic.main.fragment_greetings_dialog.view.*

class GreetingsDialogFragment : DialogFragment() {
    lateinit var viewModel: SignUpViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        viewModel.getPersonData().observe(viewLifecycleOwner, {person->
            dtvName.text = person.name
            dtvLastName.text = person.lastName
        })

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        viewModel = (activity as MainActivity).viewModel
        var rootView: View = inflater.inflate(R.layout.fragment_greetings_dialog,
            container, false)

        rootView.dbClose.setOnClickListener{
            dismiss()
        }

//       viewModel.getPersonData().observe(viewLifecycleOwner, {person->
//           dtvName.text = person.name
//           dtvLastName.text = person.lastName
//       })

        return rootView
    }
}
