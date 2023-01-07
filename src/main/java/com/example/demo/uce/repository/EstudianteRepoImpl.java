package com.example.demo.uce.repository;


import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {
	
	//punto principal de conección a mi base de datos 
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void isertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		//de esta manera añadimos
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
		this.entityManager.merge(estudiante);
		
	}

	@Override
	public Estudiante buscar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.find(Estudiante.class, id)
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
		Estudiante estu = this.buscar(id);
		this.entityManager.remove(estu);
		
	}

}
