package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelocorrecion.CuentaBancaria;
import com.example.demo.servicecorreccion.ICuentaBancariaService;
import com.example.demo.servicecorreccion.IRegistroTransferenciaService;


@SpringBootApplication
public class Prueba1DcPaDc1Application implements CommandLineRunner {
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1DcPaDc1Application.class, args);
	}
	
	@Autowired
	private ICuentaBancariaService cuentaService;
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired 
	private IRegistroTransferenciaService iRegistroTransferenciaService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaOrigen = new CuentaBancaria();
		cuentaOrigen.setNumero("132");
		cuentaOrigen.setTipo("A");
		cuentaOrigen.setSaldo(new BigDecimal(100));
		cuentaOrigen.setCedula("1321651");
		
		this.cuentaService.guardar(cuentaOrigen);

		
		CuentaBancaria cuentaDestino = new CuentaBancaria();
		cuentaDestino.setNumero("133");
		cuentaDestino.setTipo("A");
		cuentaDestino.setSaldo(new BigDecimal(50));
		cuentaDestino.setCedula("1321651");
		
		this.cuentaService.guardar(cuentaDestino);
		
		
		this.iRegistroTransferenciaService.realizar("132", "133", new BigDecimal(10));
		
		System.out.println("El saldo actual es: ");
		System.out.println(this.cuentaService.encontrar("132").getSaldo());
	}

}
