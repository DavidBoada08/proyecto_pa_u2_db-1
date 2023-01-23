package com.example.demo.servicecorreccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.modelocorrecion.CuentaBancaria;
import com.example.demo.repocorreccion.ICuentaBancariaRepo;



@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	@Override
	public void guardar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.insertar(bancaria);
	}

	@Override
	public void modificar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.actualizar(bancaria);
	}

	@Override
	public CuentaBancaria encontrar(String numero) {
		// TODO Auto-generated method stub
		CuentaBancaria bancaria1=this.bancariaRepo.buscar(numero);
		System.out.println("Se busco la siguiente cuenta: "+bancaria1);
		return bancaria1;
	}

	@Override
	public void borrar(String numero) {
		// TODO Auto-generated method stub
		this.bancariaRepo.eliminar(numero);
	}

}
