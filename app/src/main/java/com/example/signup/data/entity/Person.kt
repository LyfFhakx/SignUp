package com.example.signup.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "person"
)
data class Person(
    @PrimaryKey(autoGenerate = true)
    val id:Long,
    var name: String,
    var lastName: String,
    var birthDay: String,
    var password: String
)
