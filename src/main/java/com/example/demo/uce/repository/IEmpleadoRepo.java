package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Empleado;

public interface IEmpleadoRepo {
	
	public void insertar(Empleado empleado);
	
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void eliminar(Integer id);

}
