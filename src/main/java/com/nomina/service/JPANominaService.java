package com.nomina.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nomina.entity.Nomina;

import com.nomina.repository.NominaRepository;

@Service
public class JPANominaService implements NominaService {

	@Autowired
	private NominaRepository nominaRepository;

	

	@Override
	public List<Nomina> getNominas() {
		// TODO Auto-generated method stub
		return (List<Nomina>) nominaRepository.findAll();
	}

	@Override
	public Nomina getNominaDNI(String dni) {
		// TODO Auto-generated method stub
		Optional<Nomina> nom = nominaRepository.findById(dni);

		return nom.isEmpty() ? null : nom.get();
	}

	@Override
	public void actualizarEmpleado(Nomina emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Nomina emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void crear(Nomina nom) {
		nominaRepository.save(nom);

	}

}
