package com.example.signup.data.repository

import androidx.lifecycle.LiveData
import com.example.signup.data.AppDatabase
import com.example.signup.data.entity.Person
import com.example.signup.domain.repository.Repository

class RepositoryImpl(
    private val appDatabase: AppDatabase
): Repository {
    override fun getPersonData(): LiveData<Person> = appDatabase.getPersonDao().getPersonData()

    override suspend fun insertOrUpdate(person: Person): Long = appDatabase.getPersonDao().insertOrUpdate(person)

    override suspend fun deletePerson(person: Person) = appDatabase.getPersonDao().deletePerson(person)
}