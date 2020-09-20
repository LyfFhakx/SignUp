package com.example.signup.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.signup.data.entity.Person
import com.example.signup.domain.repository.Repository
import kotlinx.coroutines.launch

class SignUpViewModel(private val repository: Repository) : ViewModel() {

    private val _person = MutableLiveData<Person>()
    val person: LiveData<Person> = _person

    fun savePerson(person: Person) = viewModelScope.launch {
        repository.insertOrUpdate(person)
    }
    fun getPersonData() = repository.getPersonData()

    fun deletePerson(person: Person) = viewModelScope.launch {
        repository.deletePerson(person)
    }

}