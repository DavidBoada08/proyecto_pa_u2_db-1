package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.Matricula;
import com.example.demo.matriculacion.Propietario;

public interface IPropietarioRepository {

	
	  //CRUD
		public Propietario buscar(Integer id);
		public void Propietario(Propietario propietario);
		public void instertar(Propietario propietario);
		public void borrar(Integer id);
}
