package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	
	
	public void insertar(Estudiante estudiante);
	//CRUD siempre por pk "PRIMARY KEY"
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void eliminar(Integer id);
	

}
