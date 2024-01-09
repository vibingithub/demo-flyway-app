package com.ecsfin.demo.flyway.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecsfin.demo.flyway.entity.Book;
import com.ecsfin.demo.flyway.entity.Library;

@SpringBootTest
class LibraryRepositoryTest {

	@Autowired
	LibraryRepository libraryRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Test
	@Disabled
	void test() {
		
		Library library = Library.builder()
				.name("Central Library")
				.address("Trivandrum")
				.build();
		
		Book book = Book.builder()
		 		.isin("INE0J1Y01017")
		 		.name("Life")
		 		.type("Generic")
		 		.library(library)
		 		.build();
		
		bookRepository.save(book);
 
		assertTrue(()->book.getBookId() > 0);
	}
	
	@Test
	void getLibrary() {
		
		List<Library> libraries = libraryRepository.findAll();
		
		assertTrue(()->libraries.size()>0);
	}

}
