package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(CitaMedica cm) {
		this.entityManager.persist(cm);
		
	}


	@Override
	public void actualizar(CitaMedica cm) {
		this.entityManager.merge(cm);
		
	}


	@Override
	public CitaMedica buscarPorNumero(String numero) {
		TypedQuery<CitaMedica> myQuery = this.entityManager.createQuery("Select c FROM CitaMedica c where c.numeroCita=:datoNumero", CitaMedica.class);
		myQuery.setParameter("datoNumero", numero);
		return myQuery.getSingleResult();
	}


}
