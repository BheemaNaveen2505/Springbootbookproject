package com.book.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.main.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
