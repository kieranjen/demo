package com.example.books.repository

import io.micronaut.core.annotation.Introspected

@Introspected
data class BookAuthor(
    val id: Long,
    val authorName: String
)
