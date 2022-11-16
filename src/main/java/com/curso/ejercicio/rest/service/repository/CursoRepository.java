package com.curso.ejercicio.rest.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ejercicio.rest.service.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
 Optional<Curso> findByNombre(String nombre);
 
}
