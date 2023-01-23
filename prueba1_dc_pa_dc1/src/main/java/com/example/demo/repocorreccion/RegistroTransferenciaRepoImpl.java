package com.example.demo.repocorreccion;

import org.springframework.stereotype.Repository;



import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RegistroTransferenciaRepoImpl implements IRegistroTransferenciaRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(com.example.demo.modelocorrecion.RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registroTransferencia);
	}



}
