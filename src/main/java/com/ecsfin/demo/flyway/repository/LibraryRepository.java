package com.ecsfin.demo.flyway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecsfin.demo.flyway.entity.Library;

public interface LibraryRepository extends JpaRepository<Library, Long>{

}
