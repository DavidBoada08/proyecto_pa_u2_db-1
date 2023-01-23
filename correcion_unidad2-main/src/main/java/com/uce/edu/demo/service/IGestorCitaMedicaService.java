package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaMedicaService {
	
	public void agendar(String numerCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente);
	
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl);

}
