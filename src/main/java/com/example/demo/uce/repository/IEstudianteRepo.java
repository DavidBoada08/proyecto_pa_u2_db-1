package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public void isertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante );
	// buscar por PK
	public Estudiante buscar(Integer id);
	
	public void eliminar (Integer id);

}
