package com.curso.ejercicio.rest.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @Column(name = "id_alumno")
    private int idAlumno;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "edad")
    private int edad;
    
    
    @ManyToOne
    @JoinColumn(name="id_curso", nullable=false)
    private Curso curso;

}
