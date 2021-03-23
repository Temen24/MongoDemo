package ru.temen.mongodemo.domain

data class MongoUser(
    val id: String,
    val name: String,
    val age: Int? = null,
    val gender: String? = null
)
