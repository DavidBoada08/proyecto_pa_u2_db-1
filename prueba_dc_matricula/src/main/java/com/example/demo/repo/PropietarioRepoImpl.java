package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo{

	private static List<Propietario> base = new ArrayList<>();
	
	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario = null;
		
		for(Propietario p : base) {
			if(p.getCedula().equals(cedula)) {
		       propietario=p;
			}
		}	
		
		
		return propietario;
	}

	
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		base.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
		
	}

	
}
