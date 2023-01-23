package com.uce.edu.demo;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;
import com.uce.edu.demo.service.GestorCitaMedicaServiceImpl;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IPacienteService;

@SpringBootApplication
public class CorrecionU2JjApplication implements CommandLineRunner{
	
	@Autowired
	private IDoctorService idoctorService;

	@Autowired
	private IPacienteService ipacienteService;
	
	@Autowired
	private GestorCitaMedicaServiceImpl iGestroCitaMedicaService;
	
	@Autowired
	private IPacienteService pacienteService;

	
	private static Logger LOG = Logger.getLogger(CorrecionU2JjApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CorrecionU2JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Insertar Doctores

				Doctor d = new Doctor();
				d.setNombre("Carlos");
				d.setApellido("Suarez");
				d.setCedula("1712457874");
				d.setFechaNacimiento(LocalDateTime.of(1994, 12, 6, 0, 0));
				d.setNumeroConsultorio("1425");
				d.setTitulo("Medico General");
				d.setSalario(new BigDecimal(1200));

				Doctor d1 = new Doctor();
				d1.setNombre("Carlos");
				d1.setApellido("Messi");
				d1.setCedula("1712457444");
				d1.setFechaNacimiento(LocalDateTime.of(1994, 5, 6, 0, 0));
				d1.setNumeroConsultorio("1400");
				d1.setTitulo("Medico Cirujano");
				d1.setSalario(new BigDecimal(2000));

				// Los comento para que no se vuelvan a insertar en la base
				//this.idoctorService.insertar(d);
				//this.idoctorService.insertar(d1);

				// Insertar Pacientes

				Paciente p = new Paciente();
				p.setCedula("1723568985");
				p.setNombre("Ana");
				p.setApellido("Velez");
				p.setFechaNacimiento(LocalDateTime.of(2000, 5, 6, 0, 0));
				p.setCodigoIess("A1425");
				p.setEstatura(1.85);
				p.setPeso(50.4);
				p.setGenero("F");

				Paciente p1 = new Paciente();
				p1.setCedula("1723568900");
				p1.setNombre("Vanesa");
				p1.setApellido("Velasco");
				p1.setFechaNacimiento(LocalDateTime.of(2010, 5, 6, 0, 0));
				p1.setCodigoIess("A1429");
				p1.setEstatura(1.70);
				p1.setPeso(60.0);
				p1.setGenero("F");

				// Los comento para que no se vuelvan a insertar en la base
				//this.ipacienteService.insertar(p);
				//this.ipacienteService.insertar(p1);
				
				
				//this.iGestroCitaMedicaService.agendar("1222", LocalDateTime.now(),new BigDecimal(20), "Inca", "1712457874", "1723568900");
		
				//this.iGestroCitaMedicaService.actualizarCita("1222", "COVID", "Paracetamol",  LocalDateTime.now());
		

				List<PacienteSencillo> listaPaciente=this.pacienteService.reportePaciente(LocalDate.of(1949, Month.APRIL, 4), "femenino");
				LOG.info("Pacientes : "+ listaPaciente.size());
				for (PacienteSencillo pac : listaPaciente) {
			
				}
	
	
	
	}

}
