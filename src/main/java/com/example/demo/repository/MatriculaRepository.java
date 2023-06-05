package com.example.demo.repository;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaRepository {
	public void insertar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public void eliminar(String propietarioIdentificador);
	public Matricula seleccionarPorPropietario(String propietarioIdentifica);
}
