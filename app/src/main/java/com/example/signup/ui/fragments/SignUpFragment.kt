package com.example.signup.ui.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.signup.R
import com.example.signup.data.entity.Person
import com.example.signup.ui.MainActivity
import com.example.signup.ui.viewModels.SignUpViewModel
import kotlinx.android.synthetic.main.fragmnet_sign_up.*

class SignUpFragment : Fragment(R.layout.fragmnet_sign_up) {

    lateinit var viewModel: SignUpViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel

        bSignUp.setOnClickListener {
            if (etName.text.isNotEmpty()
                || etLastName.text.isNotEmpty()
                || etBirthday.text.isNotEmpty()
                || etPassword.text.isNotEmpty()
                || etPasswordCheck.text.isNotEmpty()) {
                if (etName.text.length < 2 || etLastName.text.length < 2) {
                    Toast.makeText(
                        requireContext(),
                        " Name and Last should be at least 2 symbols",
                        Toast.LENGTH_SHORT
                    ).show()
                } else if (etPassword.text.toString() == etPasswordCheck.text.toString()) {
                       val person = Person(
                                id = 123L,
                                name = etName.text.toString(),
                                lastName = etLastName.text.toString(),
                                birthDay = etBirthday.text.toString(),
                                password = etPassword.text.toString()
                            )
                    viewModel.savePerson(person)
                    findNavController().navigate(R.id.action_signUpFragment_to_greetingsFragment)
                    } else {
                        Toast.makeText(requireContext(), "Password and Password Verification should be equals", Toast.LENGTH_SHORT).show() }
            } else {
                Toast.makeText(requireContext(), " Field is empty", Toast.LENGTH_SHORT).show() }
        }

    }


}