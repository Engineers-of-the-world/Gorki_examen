package com.mycompany.modell;

import javax.persistence.*;

@Entity
@Table(name = "tipo_servicio")
public class TipoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tipo_servicio")
    int tiposervicioId;

    @Column(name = "name_servicio")
    private String nameservicio;

	public int getTiposervicioId() {
		return tiposervicioId;
	}

	public void setTiposervicioId(int tiposervicioId) {
		this.tiposervicioId = tiposervicioId;
	}

	public String getNameservicio() {
		return nameservicio;
	}

	public void setNameservicio(String nameservicio) {
		this.nameservicio = nameservicio;
	}

	public TipoServicio(int tiposervicioId, String nameservicio) {
		super();
		this.tiposervicioId = tiposervicioId;
		this.nameservicio = nameservicio;
	}

	public TipoServicio() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	
    
}