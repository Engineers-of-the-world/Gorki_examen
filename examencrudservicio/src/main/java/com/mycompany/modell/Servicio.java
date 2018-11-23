package com.mycompany.modell;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="servicio")
public class Servicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_servicio")
	long id;
	
	@Column(name = "name_servicio")
	String nameservicio;
	
	@Column(name = "ancho_bando")
	Integer anchobando;
	
	@Column(name = "precio_servicio")
	String  precioservicio;
	
	@Column(name = "costo_instalacion")
	String  costoinstalacion;
	
	@ManyToOne
	@JoinColumn(name = "tipo_servicio_id_tipo_servicio")
	private TipoServicio tipoServicio;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameservicio() {
		return nameservicio;
	}

	public void setNameservicio(String nameservicio) {
		this.nameservicio = nameservicio;
	}

	public Integer getAnchobando() {
		return anchobando;
	}

	public void setAnchobando(Integer anchobando) {
		this.anchobando = anchobando;
	}

	public String getPrecioservicio() {
		return precioservicio;
	}

	public void setPrecioservicio(String precioservicio) {
		this.precioservicio = precioservicio;
	}

	public String getCostoinstalacion() {
		return costoinstalacion;
	}

	public void setCostoinstalacion(String costoinstalacion) {
		this.costoinstalacion = costoinstalacion;
	}

	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public Servicio(long id, String nameservicio, Integer anchobando, String precioservicio, String costoinstalacion,
			TipoServicio tipoServicio) {
		super();
		this.id = id;
		this.nameservicio = nameservicio;
		this.anchobando = anchobando;
		this.precioservicio = precioservicio;
		this.costoinstalacion = costoinstalacion;
		this.tipoServicio = tipoServicio;
	}

	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
	
	
	
	
	
	