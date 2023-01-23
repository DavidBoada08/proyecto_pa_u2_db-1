package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

//
@SpringBootApplication
public class ProyectoPaU2Sc1Application implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Sc1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Estudiante estu = new Estudiante();
		estu.setNombre("David");
		estu.setApellido("Boada");
		estu.setCedula("1720030173");
		estu.setCiudad("Quito");
		estu.setGenero("M");
//		this.estudianteService.agregar(estu);
		
		Ciudadano ciu = new  Ciudadano();
		ciu.setNombre("David");
		ciu.setApellido("Boada");
		this.ciudadanoService.ingresar(ciu);
		
		Ciudadano ciu2 = new  Ciudadano();
		ciu2.setNombre("Marlon");
		ciu2.setApellido("Boada");
		this.ciudadanoService.ingresar(ciu2);
		
		Empleado empl = new Empleado();
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setCiudadano(ciu);
		this.empleadoService.crear(empl);
		
		Empleado empl2 = new Empleado();
		empl2.setSalario(new BigDecimal(50));
		empl2.setFechaIngreso(LocalDateTime.now());
		empl2.setCiudadano(ciu);
		this.empleadoService.crear(empl2);
		
		
		
		
		
		
		
		

		

	}

}
