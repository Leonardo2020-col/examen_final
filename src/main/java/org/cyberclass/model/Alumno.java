package org.cyberclass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="tb_alumnos")
public class Alumno {
	
	@Id
	@Column (name="cod_alu")
	private String codigo;
	
	@Column (name="nombre")
	private String nombre;
	
	@Column (name="id_car")
	private int carrera;
	
	@Column (name="edad")
	private String edad;
	
	@Column (name="sexo")
	private String sexo;
	
	@Column (name="seccion")
	private String seccion;

	
	
	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", carrera=" + carrera + ", edad=" + edad + ", sexo="
				+ sexo + ", seccion=" + seccion + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCarrera() {
		return carrera;
	}

	public void setCarrera(int carrera) {
		this.carrera = carrera;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
}
