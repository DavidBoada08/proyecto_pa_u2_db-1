package com.example.demo.service;

import com.example.demo.modelo.Empleado;

public interface IEmpleadoService {
	
	public void crear(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado encontrar(Integer id);
	
	public void borrar (Integer id);
	
}
