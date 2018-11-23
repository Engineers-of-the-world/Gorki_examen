package com.mycompany.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.modell.Servicio;

@Repository
@Transactional
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
	
	Servicio findById(long id);
	Optional<Servicio> findByNameservicio(String nameservicio);

}
