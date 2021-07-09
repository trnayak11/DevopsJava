package com.bookCrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookCrud.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	public List<Book> findBybookName(String name);
}
