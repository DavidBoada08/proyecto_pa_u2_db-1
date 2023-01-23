package com.uce.edu.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPacienteRepo;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo ipacienteRepo;
	
	
	@Override
	public void insertar(Paciente p) {
		this.ipacienteRepo.insertar(p);
		
	}

	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ipacienteRepo.buscar(id);
	}

	@Override
	public void actualizar(Paciente p) {
		this.ipacienteRepo.actualizar(p);
		
	}

	@Override
	public void eliminar(Integer id) {
		this.ipacienteRepo.eliminar(id);
		
	}

	@Override
	public List<PacienteSencillo> reportePaciente(LocalDate fecha, String genero) {
		return 	this.ipacienteRepo.reportePaciente(fecha, genero);
	}

}
