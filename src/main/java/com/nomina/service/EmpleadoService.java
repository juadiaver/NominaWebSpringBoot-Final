package com.nomina.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.nomina.entity.Empleado;
import com.nomina.entity.Nomina;

@Service
public interface EmpleadoService {

	public List<Empleado> getEmpleados();
	
	public Empleado getEmpleadoDNI(String dni);
	
	public List<Empleado> getEmpleadoNombre(String nombre);
	
	public List<Empleado> getEmpleadoSexo(String sexo);
	
	public List<Empleado> getEmpleadoCategoria(int categoria);
	
	public List<Empleado> getEmpleadoAnyos(int anyos);
	
	public void actualizarEmpleado(Empleado emp);
	
	public void eliminar(Empleado emp);

	public void crear(Empleado emp);
	
	public List<Nomina> getSueldoe (String dni);
	
}
