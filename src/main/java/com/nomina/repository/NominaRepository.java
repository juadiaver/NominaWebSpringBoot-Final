package com.nomina.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


import com.nomina.entity.Nomina;

@Repository
public interface NominaRepository extends CrudRepository<Nomina, String> {
	
	
}
