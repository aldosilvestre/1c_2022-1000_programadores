package com.milprogramadores.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARRERA")
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "cant_materias")
	private Integer cantMaterias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCantMaterias() {
		return cantMaterias;
	}

	public void setCantMaterias(Integer cantMaterias) {
		this.cantMaterias = cantMaterias;
	}
	
	
}
