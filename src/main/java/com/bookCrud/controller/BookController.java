package com.bookCrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookCrud.entity.Book;
import com.bookCrud.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository repository;
	
	@PostMapping("/addbook")
	public String insertBook(@RequestBody Book book) {
		repository.save(book);
		return "book saved";
	}
	
	@PostMapping("/addbooks")
	public String insertBooks(@RequestBody List<Book> book) {
		repository.saveAll(book);
		return "book list saved";
	}
	@GetMapping("/getbooks")
	public List<Book> getBook() {
		return repository.findAll();
	}
	
	@GetMapping("/getbook/{id}")
	public Optional<Book> getBook(@PathVariable long id) {
		return repository.findById(id);
	
	}
	@GetMapping("/getByName/{name}")
	public List<Book> getBookByName(@PathVariable String name) {
		return repository.findBybookName(name);
	}
}















