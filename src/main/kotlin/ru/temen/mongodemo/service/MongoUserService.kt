package ru.temen.mongodemo.service

import org.springframework.stereotype.Service
import ru.temen.mongodemo.domain.MongoUser
import ru.temen.mongodemo.repository.UserRepository

@Service
class MongoUserService(private val userRepository: UserRepository) {

    fun saveUser(user: MongoUser) = userRepository.insert(user)

    fun getById(id: String) = userRepository.findById(id)

}