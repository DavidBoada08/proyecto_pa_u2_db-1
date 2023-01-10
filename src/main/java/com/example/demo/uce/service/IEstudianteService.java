package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	
	public void agregar(Estudiante estudiante);
	//CRUD siempre por pk "PRIMARY KEY"
	public void modificicar(Estudiante estudiante);
	public Estudiante encontrar(Integer id);
	public void borrar(Integer id);

}
