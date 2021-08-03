package com.assertsolutions.capacitaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assertsolutions.capacitaciones.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>  {
	
}
