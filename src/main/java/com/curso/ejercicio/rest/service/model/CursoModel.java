package com.curso.ejercicio.rest.service.model;

import java.util.List;

import lombok.Data;

@Data
public class CursoModel {
   
    private String nombre;

    private List<AlumnoModel> alumnos;
}
