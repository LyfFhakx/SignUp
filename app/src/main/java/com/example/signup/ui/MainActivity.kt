package com.example.signup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.signup.R
import com.example.signup.data.AppDatabase
import com.example.signup.data.repository.RepositoryImpl
import com.example.signup.ui.viewModels.SignUpViewModel
import com.example.signup.ui.viewModels.SignUpViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    lateinit var viewModel:SignUpViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repository = RepositoryImpl(AppDatabase(this))
        val viewModelProviderProviderFactory = SignUpViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this,viewModelProviderProviderFactory).get(SignUpViewModel::class.java)
    }
}