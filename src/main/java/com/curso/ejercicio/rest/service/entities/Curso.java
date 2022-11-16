package com.curso.ejercicio.rest.service.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

	@Data
	@Entity
	@Table(name = "curso")
	public class Curso {
	    @Id
	    @Column(name = "id_curso")
	    private int idCurso;

	    @Column(name = "nombre")
	    private String nombre;

	    @OneToMany(mappedBy = "curso")
	    private List<Alumno> alumnos;

}
