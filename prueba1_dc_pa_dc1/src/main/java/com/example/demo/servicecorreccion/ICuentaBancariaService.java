package com.example.demo.servicecorreccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelocorrecion.CuentaBancaria;



public interface ICuentaBancariaService {
	
	public void guardar (CuentaBancaria bancaria);
	public void modificar(CuentaBancaria bancaria);
	public CuentaBancaria encontrar(String numero);
	public void borrar(String numero);
	
	
	
	
}
