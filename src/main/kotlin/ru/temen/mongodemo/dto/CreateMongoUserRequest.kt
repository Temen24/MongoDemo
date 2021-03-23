package ru.temen.mongodemo.dto

data class CreateMongoUserRequest(
    val name: String,
    val age: Int? = null,
    val gender: String? = null
)
