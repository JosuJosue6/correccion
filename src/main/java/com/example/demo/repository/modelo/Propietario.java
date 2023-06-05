package com.example.demo.repository.modelo;

import java.time.LocalDate;

public class Propietario {
	private String nombre;
	private String Apellido;
	private String identificacion;
	private LocalDate fechaNacimiento;
	
	//Get y Set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", Apellido=" + Apellido + ", identificacion=" + identificacion
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
