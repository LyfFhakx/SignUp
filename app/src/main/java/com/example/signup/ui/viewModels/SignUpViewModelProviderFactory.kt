package com.example.signup.ui.viewModels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.signup.domain.repository.Repository

@Suppress("UNCHECKED_CAST")
class SignUpViewModelProviderFactory(
    private val repository: Repository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SignUpViewModel(repository) as T
    }
}