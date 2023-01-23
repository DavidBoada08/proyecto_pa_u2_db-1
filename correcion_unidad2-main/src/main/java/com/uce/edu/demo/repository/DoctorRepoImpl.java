package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor d) {
		this.entityManager.persist(d);

	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizar(Doctor d) {
		this.entityManager.merge(d);

	}

	@Override
	public void eliminar(Integer id) {
		
		Doctor d = this.buscar(id);
		
		this.entityManager.remove(d);

	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		TypedQuery<Doctor> myQuery = this.entityManager.createQuery("select d from Doctor d where d.cedula =:datoCedula", Doctor.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

}
