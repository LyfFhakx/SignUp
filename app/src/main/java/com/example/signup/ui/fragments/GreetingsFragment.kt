package com.example.signup.ui.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.signup.R
import com.example.signup.ui.MainActivity
import com.example.signup.ui.viewModels.SignUpViewModel
import kotlinx.android.synthetic.main.fragment_greetings.*
import kotlinx.android.synthetic.main.fragment_greetings_dialog.*
import kotlinx.android.synthetic.main.fragment_greetings_dialog.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GreetingsFragment : Fragment(R.layout.fragment_greetings) {

    lateinit var viewModel: SignUpViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        bGreetings.setOnClickListener {
            var dialog = GreetingsDialogFragment()
            dialog.show(parentFragmentManager, "customDialog")
        }
    }
}
