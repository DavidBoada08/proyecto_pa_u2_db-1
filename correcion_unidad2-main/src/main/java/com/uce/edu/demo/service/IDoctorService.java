package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Doctor;

public interface IDoctorService {
	
	public void insertar(Doctor d);

	public Doctor buscar(Integer id);

	public void actualizar(Doctor d);

	public void eliminar(Integer id);


}
