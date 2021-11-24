package org.cyberclass.controller;

import org.cyberclass.model.Alumno;
import org.cyberclass.repository.IAlumnoRepository;
import org.cyberclass.repository.ICarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AlumnoController {
	
	@Autowired
	private ICarreraRepository repoc;
	
	@Autowired
	private IAlumnoRepository repo;

	
	
	@GetMapping("/cargar")
	public String cargarPag(Model model){
		model.addAttribute("alumno", new Alumno());
		model.addAttribute("lstCarreras", repoc.findAll());
		return "registro-pareja";
	}
	
	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Alumno  alumno) {
		repo.save(alumno);
		System.out.println(alumno);

		return "registro-pareja";
	}
	
	
}
