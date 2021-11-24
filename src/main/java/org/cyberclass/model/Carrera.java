package org.cyberclass.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_carreras")
public class Carrera {
	
	@Id
	private int codcarrera;
	
	private String nombre;

	
	@Override
	public String toString() {
		return "Carrera [codcarrera=" + codcarrera + ", nombre=" + nombre + "]";
	}

	public int getCodcarrera() {
		return codcarrera;
	}

	public void setCodcarrera(int codcarrera) {
		this.codcarrera = codcarrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
