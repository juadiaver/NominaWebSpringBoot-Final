package com.nomina.service;

import java.util.List;


import org.springframework.stereotype.Service;


import com.nomina.entity.Nomina;

@Service
public interface NominaService {

	public List<Nomina> getNominas();
	
	public Nomina getNominaDNI(String dni);
	
	public void actualizarEmpleado(Nomina emp);
	
	public void eliminar(Nomina emp);

	public void crear(Nomina emp);
	
	
	
}
