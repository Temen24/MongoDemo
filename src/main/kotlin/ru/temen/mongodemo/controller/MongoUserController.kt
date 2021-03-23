package ru.temen.mongodemo.controller

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ru.temen.mongodemo.domain.MongoUser
import ru.temen.mongodemo.dto.CreateMongoUserRequest
import ru.temen.mongodemo.service.MongoUserService
import java.net.URI
import java.util.*


@RestController
@RequestMapping("/user")
class MongoUserController(
    private val userService: MongoUserService
) {

    @GetMapping
    fun getUserById(@RequestParam id: String) =
        ResponseEntity.ok().body(userService.getById(id))

    @PostMapping(value = ["/save"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun saveUser(@RequestBody request: CreateMongoUserRequest): ResponseEntity<MongoUser> =
        ResponseEntity.created(URI.create("")).body(
            userService.saveUser(
                MongoUser(
                    id = UUID.randomUUID().toString(),
                    name = request.name,
                    age = request.age,
                    gender = request.gender
                )
            )
        )
}