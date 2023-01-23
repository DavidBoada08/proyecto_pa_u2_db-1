package com.example.demo.matriculacion.repository;

import com.example.demo.matriculacion.Matricula;
import com.example.demo.matriculacion.Vehiculo;

public interface IVehiculoRepository {

	
	
	  //CRUD
		public Vehiculo buscar(Integer id);
		public void actualizar(Vehiculo vehiculo);
		public void instertar(Vehiculo vehiculo);
		public void borrar(Integer id);
}
