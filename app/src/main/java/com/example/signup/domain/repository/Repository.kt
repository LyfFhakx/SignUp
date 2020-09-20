package com.example.signup.domain.repository

import androidx.lifecycle.LiveData
import com.example.signup.data.entity.Person

interface Repository {
    fun getPersonData():LiveData<Person>

    suspend fun insertOrUpdate(person:Person):Long

    suspend fun deletePerson(person: Person)

}