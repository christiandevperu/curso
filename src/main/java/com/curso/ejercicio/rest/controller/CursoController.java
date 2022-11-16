package com.curso.ejercicio.rest.controller;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.ejercicio.rest.service.CursoService;
import com.curso.ejercicio.rest.service.model.CursoModel;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {

	@Autowired
	private CursoService cursoService;


	@GetMapping(path = "/get", produces = {
			MediaType.APPLICATION_JSON }, params={"curso","limite"})
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> getcurso(
			@RequestParam String curso,
			@RequestParam Integer limite)
			throws Exception {
			
			CursoModel cursoModel= cursoService.getCurso(curso, limite);
		
		return new ResponseEntity<>(cursoModel, HttpStatus.OK);
	}
	
	@GetMapping(path = "/test", produces = {
			MediaType.APPLICATION_JSON })
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> getcursos()
			throws Exception {
			
		CursoModel cursoModel= cursoService.getCurso("test", 2);
		
		return new ResponseEntity<>(cursoModel, HttpStatus.OK);
	}
	
}
