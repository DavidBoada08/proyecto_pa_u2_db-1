package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.repository.ICiudadanoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private ICiudadanoRepo ciudadanoRepo;
	@Override
	public void ingresar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.insertar(ciudadano);
	}
	@Override
	public void modificar(Ciudadano ciudadano) {
		this.ciudadanoRepo.actualizar(ciudadano);
		
	}
	@Override
	public Ciudadano encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.buscar(id);
	}
	@Override
	public void quitar(Integer id) {
		this.ciudadanoRepo.eliminar(id);
		
	}
	
	
	

}
