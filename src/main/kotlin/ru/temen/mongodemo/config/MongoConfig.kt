package ru.temen.mongodemo.config

import com.mongodb.client.MongoClient
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import java.util.*
import com.mongodb.client.MongoClients

import com.mongodb.MongoClientSettings

import com.mongodb.ConnectionString


@Configuration
class MongoConfig : AbstractMongoClientConfiguration() {

    override fun getDatabaseName(): String = "test"

    override fun mongoClient(): MongoClient =
        MongoClients.create(
            MongoClientSettings.builder()
                .applyConnectionString(
                    ConnectionString("mongodb://localhost:27017/test")
                )
                .build()
        )

    override fun getMappingBasePackages(): MutableCollection<String> = Collections.singleton("ru.temen")
}