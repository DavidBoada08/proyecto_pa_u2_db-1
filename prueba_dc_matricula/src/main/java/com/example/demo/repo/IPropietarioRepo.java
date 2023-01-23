package com.example.demo.repo;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepo {

	public void crear(Propietario  propietario);
	public void eliminar(String cedula);
	public Propietario buscar(String cedula);
	
}
