package com.example.books.service

import com.example.books.repository.Book
import com.example.books.repository.BookAuthor
import com.example.books.repository.BookRepository
import jakarta.inject.Singleton

@Singleton
class BooksService(
    private val bookRepository: BookRepository
) {
    fun list(): List<Book> = bookRepository.list()

    fun listAuthors(): List<BookAuthor> = bookRepository.listAuthors()
}