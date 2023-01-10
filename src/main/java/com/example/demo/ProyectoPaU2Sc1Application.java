package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

//
@SpringBootApplication
public class ProyectoPaU2Sc1Application implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;

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

//		Estudiante estu2 = new Estudiante();
		estu.setId(2);
		estu.setNombre("Clare");
		estu.setApellido("Boada");
		estu.setCedula("1720030173");
		estu.setCiudad("Quito");
		estu.setGenero("F");
		//this.estudianteService.agregar(estu);

		estu.setId(3);
		estu.setNombre("Marlon");
		estu.setApellido("Boada");
		estu.setCedula("1720030173");
		estu.setCiudad("Quito");
		estu.setGenero("F");
//		this.estudianteService.agregar(estu);

		// Buscar estudiante
		// this.estudianteService.encontrar(2);
		
		//eliminar
		//this.estudianteService.borrar(2);
		
		//actualzar
//		estu.setId(3);
//		estu.setNombre("Marlon");
//		this.estudianteService.modificicar(estu);

		estu.setId(4);
		estu.setNombre("Roberto");
		estu.setApellido("Boada");
		estu.setCedula("1720030173");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		//this.estudianteService.agregar(estu);
		
		estu.setId(5);
		estu.setNombre("Julieta");
		estu.setApellido("Aguacondo");
		estu.setCedula("1720030173");
		estu.setCiudad("Quito");
		estu.setGenero("f");
		//this.estudianteService.agregar(estu);
		
		estu.setId(7);
		estu.setNombre("Esperanza");
		estu.setApellido("Aguacondo");
		estu.setCedula("1720030173");
		estu.setCiudad("Quito");
		estu.setGenero("F");
		this.estudianteService.agregar(estu);
		
		
		

	}

}
