package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IDoctorRepo;
import com.uce.edu.demo.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepo idoctorRepo;
	
	@Override
	public void insertar(Doctor d) {
		this.idoctorRepo.insertar(d);
		
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.idoctorRepo.buscar(id);
	}

	@Override
	public void actualizar(Doctor d) {
		this.idoctorRepo.actualizar(d);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.idoctorRepo.eliminar(id);
		
	}

}
