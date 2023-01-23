package com.example.demo.servicecorreccion;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;



public interface IRegistroTransferenciaService {


	
	
	public void realizar (String numeroOrigen, String numeroDestino, BigDecimal monto);


	
}
