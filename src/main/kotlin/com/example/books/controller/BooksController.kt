package com.example.books.controller

import com.example.books.service.BooksService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/books")
class BooksController(
    private val booksService: BooksService
) {

    @Get("/")
    fun books() = booksService.list()

    @Get("/authors")
    fun authors() = booksService.listAuthors()
}