package com.example.demo.repocorreccion;

import com.example.demo.modelocorrecion.RegistroTransferencia;

public interface IRegistroTransferenciaRepo {

	
	//CRUD
	
	public void insertar(RegistroTransferencia registroTransferencia);

	//No hace falta:
	//
	//public void actualizar(CuentaBancaria bancaria);
	//public void eliminar(String numero);
}
