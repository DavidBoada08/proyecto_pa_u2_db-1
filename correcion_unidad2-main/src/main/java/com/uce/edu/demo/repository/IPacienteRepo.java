package com.uce.edu.demo.repository;

import java.time.LocalDate;
import java.util.List;

import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;

public interface IPacienteRepo {

	public void insertar(Paciente p);

	public Paciente buscar(Integer id);

	public void actualizar(Paciente p);

	public void eliminar(Integer id);
	
	public Paciente buscarPorCedula(String cedula);
	
	public List<PacienteSencillo> reportePaciente(LocalDate fecha, String genero);

	
}
