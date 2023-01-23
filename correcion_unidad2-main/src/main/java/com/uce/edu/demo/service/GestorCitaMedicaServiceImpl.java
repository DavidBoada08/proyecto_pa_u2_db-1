package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICitaMedicaRepo;
import com.uce.edu.demo.repository.IDoctorRepo;
import com.uce.edu.demo.repository.IPacienteRepo;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;

@Service
public class GestorCitaMedicaServiceImpl implements IGestorCitaMedicaService {

	@Autowired
	private ICitaMedicaService icitaMedicaService;

	@Autowired
	private IPacienteRepo iPacienteRepository;

	@Autowired
	private IDoctorRepo iDocorRepository;
	
	@Autowired
	private ICitaMedicaRepo ICitaMedicaRepo;

	@Override
	public void agendar(String numerCita, LocalDateTime fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		CitaMedica cm = new CitaMedica();
		cm.setNumeroCita(cedulaPaciente);
		cm.setFechaCita(fechaCita);
		cm.setValorCita(valorCita);
		cm.setLugarCita(lugarCita);

		Doctor d = this.iDocorRepository.buscarPorCedula(cedulaDoctor);

		cm.setDoctor(d);

		Paciente p = this.iPacienteRepository.buscarPorCedula(cedulaPaciente);
		cm.setPaciente(null);

		this.icitaMedicaService.insertar(cm);

	}

	@Override
	public void actualizarCita(String numeroCita, String diagnostico, String receta, LocalDateTime fechaControl) {
		
		CitaMedica cm = this.ICitaMedicaRepo.buscarPorNumero(numeroCita);
		
		cm.setDiagnostico(diagnostico);
		cm.setReceta(receta);
		cm.setFechaDeControl(fechaControl);
		
		this.ICitaMedicaRepo.actualizar(cm);

	}

}
