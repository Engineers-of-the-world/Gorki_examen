package com.mycompany.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.modell.Servicio;
import com.mycompany.service.ServicioService;

@RestController
@RequestMapping(value="/api/ser")


public class ServicioCtrl {
	
	@Autowired
	
	ServicioService servicioService;
	
	@GetMapping(value="/all")
 protected List<Servicio> allServicio(){
	 return servicioService.findAllServicio();
 } 
	@PostMapping("/ifexist")
 protected boolean isExistServicio(@RequestBody Servicio servicio){
	 return servicioService.isServicioExist(servicio);
 }
	
	@PostMapping(value="/save")
 protected void save(@RequestBody Servicio servicio){
		
		if(servicioService.isServicioExist(servicio)) {
			servicioService.updateServicio(servicio);
			System.out.println("el servicio ha sido actualizado");
			
		}else {
			servicioService.saveServicio(servicio);
			System.out.println("el servicio ha sido creado");
		}
		servicioService.saveServicio(servicio);
	 
 }
	@GetMapping(value="/update")
 protected String update(){
	 return "Welcome a spring boot";
 }	
	@GetMapping(value="/delete")
 protected String delete(){
	 return "Welcome a spring boot";
 }	
}
