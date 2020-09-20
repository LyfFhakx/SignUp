package com.example.signup.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.signup.data.entity.Person

@Dao
interface PersonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(person: Person):Long

    @Query("SELECT *FROM person")
    fun getPersonData():LiveData<Person>

    @Delete
    suspend fun deletePerson(person: Person)

}