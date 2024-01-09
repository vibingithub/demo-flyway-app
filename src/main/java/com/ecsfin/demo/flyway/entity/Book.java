package com.ecsfin.demo.flyway.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

	@Id
	@SequenceGenerator(name = "bookSequence",
						sequenceName = "bookSequence",
						initialValue = 1000,
						allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "bookSequence")
	private Long bookId;
	
	private String name;
	private String isin;
	private String type;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "library_id",
				referencedColumnName = "libraryId",
				nullable = false
				)
	private Library library;
}
