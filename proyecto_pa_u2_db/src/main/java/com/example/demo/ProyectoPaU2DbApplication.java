package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Ciudadano;
import com.example.demo.modelo.Empleado;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;





@SpringBootApplication
public class ProyectoPaU2DbApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2DbApplication.class, args);
	}

	@Autowired
	private IEmpleadoService empleadoService;
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Ciudadano ciu = new  Ciudadano();
		ciu.setNombre("David");
		ciu.setApellido("Boada");
		//this.ciudadanoService.ingresar(ciu);
		this.ciudadanoService.ingresar(ciu);
		
		/*Ciudadano ciu2 = new  Ciudadano();
		ciu2.setNombre("Marlon");
		ciu2.setApellido("Boada");
		this.ciudadanoService.ingresar(ciu2);
		*/
		Empleado empl = new Empleado();
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		empl.setCiudadano(ciu);
		this.empleadoService.crear(empl);
	}

}
