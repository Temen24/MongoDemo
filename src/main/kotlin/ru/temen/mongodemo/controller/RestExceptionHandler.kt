package ru.temen.mongodemo.controller

import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import com.mongodb.MongoTimeoutException
import org.springframework.http.HttpHeaders
import org.springframework.web.context.request.WebRequest
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import java.lang.Exception

@ControllerAdvice
class RestExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(MongoTimeoutException::class)
    fun handleMongoTimeoutException(
        ex: Exception?, request: WebRequest?
    ): ResponseEntity<Any> {
        return ResponseEntity(
            "Database is unavailable", HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        )
    }
}