package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.modell.Servicio;
import com.mycompany.repository.ServicioRepository;
@Service

public  class ServicioServiceImpl implements ServicioService{
	
	@Autowired
	ServicioRepository servicioRepository;

	@Override
	public Servicio findById(long id) {
		
		return servicioRepository.findById(id);
	}

	@Override
	public Optional<Servicio>findByNameservicio(String nameservicio) {
		return servicioRepository.findByNameservicio(nameservicio);
	}
	
	@Override
	public void saveServicio(Servicio servicio) {
		servicioRepository.save(servicio);
	}

	@Override
	public void updateServicio(Servicio servicio) {
		servicioRepository.save(servicio);
		
	}

	@Override
	public void deleteServicioById(long id) {
		servicioRepository.deleteById(id);
		
	}

	@Override
	public List<Servicio> findAllServicio() {
	
		return servicioRepository.findAll();
	}

	@Override
	public void deleteAllServicio() {
		 servicioRepository.deleteAll();
	}

	@Override
	public boolean isServicioExist(Servicio servicio) {
		return findByNameservicio(servicio.getNameservicio())!=null;
	}

}



