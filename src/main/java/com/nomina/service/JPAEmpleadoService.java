package com.nomina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nomina.entity.Empleado;
import com.nomina.entity.Nomina;
import com.nomina.repository.EmpleadoRepository;
@Service
public class JPAEmpleadoService implements EmpleadoService {

	@Autowired
	private EmpleadoRepository nominaRepository;
	
	@Override
	public List<Empleado> getEmpleados() {
		
		return  (List<Empleado>) nominaRepository.findAll();
	}

	@Override
	public Empleado getEmpleadoDNI(String dni) {
		
		Optional<Empleado> emp = nominaRepository.findById(dni);
		
		return emp.isEmpty() ? null : emp.get();
	}

	@Override
	public List<Empleado> getEmpleadoNombre(String nombre) {
		return nominaRepository.findByNombre(nombre);
	}

	@Override
	public List<Empleado> getEmpleadoSexo(String sexo) {
		return nominaRepository.findBySexo(sexo);
	}

	@Override
	public List<Empleado> getEmpleadoCategoria(int categoria) {
		return nominaRepository.findByCategoria(categoria);
	}

	@Override
	public List<Empleado> getEmpleadoAnyos(int anyos) {
		return nominaRepository.findByAntiguedad(anyos);
	}


	@Override
	public void actualizarEmpleado(Empleado emp) {
		nominaRepository.save(emp);
	}

	@Override
	public void eliminar(Empleado emp) {
		nominaRepository.delete(emp);
		
	}
	
	@Override
	public void crear(Empleado emp) {
		nominaRepository.save(emp);
		
	}

	@Override
	public List<Nomina> getSueldoe(String dni) {
		return nominaRepository.findByDniSueldo(dni);
	}

}
