package com.example.books.repository

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity(value = "BOOKS")
data class Book(
    @field:Id val id: Long,
    val name: String
)
