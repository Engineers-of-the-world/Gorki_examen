package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.modell.Servicio;


public interface ServicioService {
	
	Servicio findById(long id);
	
    Optional<Servicio> findByNameservicio(String nameservicio);
	
	void saveServicio(Servicio servicio);
	
	void updateServicio(Servicio servicio);
	
	void deleteServicioById(long id);

	List<Servicio> findAllServicio(); 
	
	void deleteAllServicio();
	
	public boolean isServicioExist(Servicio servicio);

	

	
	

}