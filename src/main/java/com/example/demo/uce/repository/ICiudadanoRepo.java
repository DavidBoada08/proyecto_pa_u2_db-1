package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoRepo {
	
	public void insertar(Ciudadano ciudadano);
	
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void eliminar(Integer id);

}
