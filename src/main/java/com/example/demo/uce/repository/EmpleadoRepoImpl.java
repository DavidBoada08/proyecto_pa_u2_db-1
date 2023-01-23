package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
		
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado empl = this.buscar(id);
		this.entityManager.remove(empl);
		
	}

}
