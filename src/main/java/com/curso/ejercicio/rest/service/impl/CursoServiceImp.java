package com.curso.ejercicio.rest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ejercicio.rest.service.CursoService;
import com.curso.ejercicio.rest.service.entities.Alumno;
import com.curso.ejercicio.rest.service.entities.Curso;
import com.curso.ejercicio.rest.service.model.AlumnoModel;
import com.curso.ejercicio.rest.service.model.CursoModel;
import com.curso.ejercicio.rest.service.repository.CursoRepository;

@Service
public class CursoServiceImp implements CursoService {

	@Autowired
	private  CursoRepository cursoRepository;
	
	@Override
	public CursoModel getCurso(String nombre, int limit) {
	
		Optional<Curso> curso	= cursoRepository.findByNombre(nombre);
		
		if(curso.isPresent()) {
			CursoModel model= new CursoModel();
			model.setNombre(curso.get().getNombre());
			
			if(curso.get().getAlumnos()!=null&&curso.get().getAlumnos().size()>0) {
				model.setAlumnos(curso.get().getAlumnos().stream().limit(limit).map(x->{
					AlumnoModel alumno= new AlumnoModel();
					alumno.setId_alumno(x.getIdAlumno()); //implementacion
					alumno.setNombre(x.getNombre());
					alumno.setApellidos(x.getApellidos());
					alumno.setEdad(x.getEdad());
					return alumno;
				}).collect(Collectors.toList()));
			}
			
			return model;
			
		}
			
		
		return null;
	}

}
