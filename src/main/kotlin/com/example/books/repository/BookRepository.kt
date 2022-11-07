package com.example.books.repository

import io.micronaut.data.annotation.Query
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.GenericRepository

@JdbcRepository(dialect = Dialect.H2)
interface BookRepository : GenericRepository<Book, Long> {
    fun list(): List<Book>

    @Query(value = "select id, author_name from books;", nativeQuery = true)
    fun listAuthors(): List<BookAuthor>
}