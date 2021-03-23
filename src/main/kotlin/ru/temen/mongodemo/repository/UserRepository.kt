package ru.temen.mongodemo.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ru.temen.mongodemo.domain.MongoUser

interface UserRepository : MongoRepository<MongoUser, String>