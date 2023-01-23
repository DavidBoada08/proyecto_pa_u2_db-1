package com.example.demo.repocorreccion;

import com.example.demo.modelocorrecion.CuentaBancaria;

public interface ICuentaBancariaRepo {
	//CRUD
	
	public void insertar(CuentaBancaria bancaria);
	public CuentaBancaria buscar(String numero);
	public void actualizar(CuentaBancaria bancaria);
	public void eliminar(String numero);
	
	
}
