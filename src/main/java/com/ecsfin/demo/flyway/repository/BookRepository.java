package com.ecsfin.demo.flyway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecsfin.demo.flyway.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
