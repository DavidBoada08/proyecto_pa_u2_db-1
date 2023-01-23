package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Doctor;

public interface IDoctorRepo {

	public void insertar(Doctor d);

	public Doctor buscar(Integer id);

	public void actualizar(Doctor d);

	public void eliminar(Integer id);

	public Doctor buscarPorCedula(String cedula);
	
}
