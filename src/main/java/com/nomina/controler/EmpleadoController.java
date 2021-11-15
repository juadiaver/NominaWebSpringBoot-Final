package com.nomina.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nomina.entity.Empleado;
import com.nomina.entity.Nomina;
import com.nomina.service.JPAEmpleadoService;
import com.nomina.service.JPANominaService;

@Controller
@RequestMapping
public class EmpleadoController {

	Empleado emp = null;
	Nomina nom = null;
	@Autowired
	private JPAEmpleadoService empSercive;
	@Autowired
	private JPANominaService nomSercive;

	@GetMapping("")
	public String index() {

		return "index";
	}

	@GetMapping("/index")
	public String index2() {

		return "index";
	}

	@GetMapping("/mostrar")
	public String listar(Model model) {
		List<Empleado> empleados = empSercive.getEmpleados();
		model.addAttribute("lista", empleados);
		return "mostrar";
	}

	@GetMapping("/agregar")
	public String agregar(Model model) {
		model.addAttribute("empleado", new Empleado());
		return "agregar";
	}
	
	@GetMapping("/buscar")
	public String buscar(Model model) {
		
		return "buscar";
	}
	
	@PostMapping("/buscarDni")
	public String buscarEmpleado(@RequestParam String dni, Model model) {
		
		emp = empSercive.getEmpleadoDNI(dni);

		if (emp == null) {
			return "mostrarDni";

		} else {

			model.addAttribute("lista", emp);
			return "mostrarDni";
		}
	}
	
	@PostMapping("/buscarNombre")
	public String buscarNombre(@RequestParam String nombre, Model model) {
		
		List<Empleado> empleados = empSercive.getEmpleadoNombre(nombre);
		

		if (empleados.isEmpty()) {
			return "mostrar";

		} else {

			model.addAttribute("lista", empleados);
			return "mostrar";
		}
	}
	
	@PostMapping("/buscarCategoria")
	public String buscarCategoria(@RequestParam int categoria, Model model) {
		
		List<Empleado> empleados = empSercive.getEmpleadoCategoria(categoria);
		

		if (empleados.isEmpty()) {
			return "mostrar";

		} else {

			model.addAttribute("lista", empleados);
			return "mostrar";
		}
	}
	
	@PostMapping("/buscarAntiguedad")
	public String buscarAntiguedad(@RequestParam int antiguedad, Model model) {
		
		List<Empleado> empleados = empSercive.getEmpleadoAnyos(antiguedad);
		

		if (empleados.isEmpty()) {
			return "mostrar";

		} else {

			model.addAttribute("lista", empleados);
			return "mostrar";
		}
	}
	
	@PostMapping("/buscarSexo")
	public String buscarSexo(@RequestParam String sexo, Model model) {
		
		List<Empleado> empleados = empSercive.getEmpleadoSexo(sexo);
		

		if (empleados.isEmpty()) {
			return "mostrar";

		} else {

			model.addAttribute("lista", empleados);
			return "mostrar";
		}
	}
	

	@PostMapping("/agregar")
	public String crear(@Validated Empleado emp, Model model) {
		
		empSercive.crear(emp);
		
		Nomina nom = new Nomina();
		nom.setDni(emp.getDni());
		nom.setSueldo(nom.sueldo(emp));
		
		nomSercive.crear(nom);
		
		return "redirect:/mostrar";
	}

	@GetMapping(value = "/editar/{dni}")
	public String editar(@PathVariable String dni, Model model) {

		model.addAttribute("empleado", empSercive.getEmpleadoDNI(dni));
		return "editar";
	}
	
	@GetMapping(value = "/eliminar/{dni}")
	public String eliminar(@Validated Empleado emp, Model model) {
		
		empSercive.eliminar(emp);
		return "redirect:/mostrar";
	}

	@PostMapping(value = "/editar/{dni}")
	public String editar(@Validated Empleado emp, Model model) {

		empSercive.crear(emp);
		
		Nomina nom = new Nomina();
		nom.setDni(emp.getDni());
		nom.setSueldo(nom.sueldo(emp));
		
		nomSercive.crear(nom);
		return "redirect:/mostrar";
	}

	@GetMapping("/buscaSueldo")
	public String sueldo() {

		return "buscaSueldo";
	}

	@PostMapping("/buscaSueldo")
	public String sueldo(@RequestParam String dni, Model model) {
		nom = nomSercive.getNominaDNI(dni);

		if (nom == null) {
			return "sueldo";

		} else {

			model.addAttribute("lista", nom);
			return "sueldo";
		}
	}
 }
