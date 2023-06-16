package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empleado;

public interface IEmpleadoService {
	
	public void ingresar(Empleado empleado);
	
	public void modificar(Empleado empleado);
	public Empleado encontrar(Integer id);
	public void quitar(Integer id);

}
