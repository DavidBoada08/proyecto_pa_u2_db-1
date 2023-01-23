package com.uce.edu.demo.repository;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;


@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Paciente p) {
		this.entityManager.persist(p);

	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void actualizar(Paciente p) {
		this.entityManager.merge(p);

	}

	@Override
	public void eliminar(Integer id) {
		Paciente p = this.buscar(id);

		this.entityManager.remove(p);

	}
	
	@Override
	public Paciente buscarPorCedula(String cedula) {
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery("select p from Paciente p where p.cedula =:datoCedula", Paciente.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<PacienteSencillo> reportePaciente(LocalDate fecha, String genero) {
		TypedQuery<PacienteSencillo> myQuery= this.entityManager.createQuery("SELECT NEW com.uce.edu.demo.repository.modelo.PacienteSencillo(p.cedula, p.nombre, p.fechaNacimiento, p.genero)  FROM Paciente p where p.fechaNacimiento>=:valor1 AND p.genero=:valor2", PacienteSencillo.class);
		myQuery.setParameter("valor1", fecha);
		myQuery.setParameter("valor2", genero);
	
		return myQuery.getResultList();
	}

}
