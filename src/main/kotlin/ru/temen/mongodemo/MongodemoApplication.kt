package ru.temen.mongodemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories
@SpringBootApplication
class MongodemoApplication

fun main(args: Array<String>) {
    runApplication<MongodemoApplication>(*args)
}


