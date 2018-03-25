package com.markos.liquibase.sqlfile.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TASK")
@Data
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id", nullable = false, unique = true)
	private Long id;

	@Column
	private String description;

	@Column
	private Boolean completed;
}
