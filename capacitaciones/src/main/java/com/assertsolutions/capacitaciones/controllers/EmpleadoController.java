package com.assertsolutions.capacitaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.assertsolutions.capacitaciones.model.Empleado;
import com.assertsolutions.capacitaciones.repository.EmpleadoRepository;

@RestController
public class EmpleadoController {
	
	@Autowired
	private EmpleadoRepository repository;
	
	@GetMapping("/all")
	@ResponseBody
	public List<Empleado> listarEmpleados() {
		return repository.findAll();
	}
	
	@GetMapping("/{idtf}")
	public Empleado consultarPorId(@PathVariable Integer idtf) {
		return repository.getOne(idtf);
	}
	
	@PostMapping
	@ResponseBody
	public Empleado agregarEmpleado(@RequestBody Empleado empleado) {
		return repository.save(empleado);
	}
	
	@DeleteMapping("/{idtf}")
	@ResponseBody
	public void eliminarEmpleado(@PathVariable Integer idtf) {
		repository.deleteById(idtf);
	}
 
}
