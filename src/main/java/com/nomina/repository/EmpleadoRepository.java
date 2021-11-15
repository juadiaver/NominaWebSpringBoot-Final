package com.nomina.repository;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nomina.entity.Empleado;
import com.nomina.entity.Nomina;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, String> {
	
	
	
	
	@Query (value ="select * from empleado where nombre =:nombre", nativeQuery=true)
	  List<Empleado> findByNombre(@Param("nombre") String nombre);
	
	@Query (value ="select * from empleado where categoria =:categoria", nativeQuery=true)
	  List<Empleado> findByCategoria(@Param("categoria")int categoria);
	
	@Query (value ="select * from empleado where anyos =:anyos", nativeQuery=true)
	  List<Empleado> findByAntiguedad(@Param("anyos")int anyos);
	
	@Query (value ="select * from empleado where sexo =:sexo", nativeQuery=true)
	  List<Empleado> findBySexo(@Param("sexo")String sexo);
	
	@Query (value ="select * from nomina where dni =:dni", nativeQuery=true)
	List<Nomina> findByDniSueldo(@Param("dni")String dni);
	
	
}
