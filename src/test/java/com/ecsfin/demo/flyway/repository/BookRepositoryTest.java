package com.ecsfin.demo.flyway.repository;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecsfin.demo.flyway.entity.Book;

@SpringBootTest
class BookRepositoryTest {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	void test() {
		 Book book = Book.builder()
				 		.isin("INE0J1Y01017")
				 		.name("Life")
				 		.type("Generic")
				 		.build();
		 bookRepository.save(book);
		 
		 assertTrue(()->book.getBookId() > 0);
	}

}
