package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EmpleadoRepoImpl implements IEmpleadoRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
		
	}

	@Override
	public void actualizar(Empleado empleado) {
	this.entityManager.merge(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
		
	}
	

}
