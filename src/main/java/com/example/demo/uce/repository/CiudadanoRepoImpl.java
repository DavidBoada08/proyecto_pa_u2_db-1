package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
				this.entityManager.persist(entityManager);
	}


	@Override
	public void actualizar(Ciudadano ciudadano) {
	 this.entityManager.merge(ciudadano);
		
	}


	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}


	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
		
	}

}
