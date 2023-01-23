package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.Matricula;

public interface IMatriculaRepository {

	
    //CRUD
	public Matricula buscar(Integer id);
	public void actualizar(Matricula matricula);
	public void instertar(Matricula matricula);
	public void borrar(Integer id);
}
