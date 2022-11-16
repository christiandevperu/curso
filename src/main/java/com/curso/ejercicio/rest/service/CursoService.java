package com.curso.ejercicio.rest.service;

import com.curso.ejercicio.rest.service.model.CursoModel;

public interface CursoService {

	public CursoModel getCurso(String nombre, int limit);
}
