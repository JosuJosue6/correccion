package com.example.demo.service;

import com.example.demo.repository.modelo.Matricula;

public interface MatriculaService {
	public void agregar(Matricula matricula);
	public void actualizar(Matricula matricula);
	public void eliminar(String propietarioIdentificador);
	public Matricula buscar(String propietarioIdentifica);
	public void realizarMatricula(String propietario, String placa);
}
