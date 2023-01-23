package com.uce.edu.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepo {
	
	public void insertar(CitaMedica cm);

	public void actualizar(CitaMedica cm);
	
	public CitaMedica buscarPorNumero(String numero);
	

}
