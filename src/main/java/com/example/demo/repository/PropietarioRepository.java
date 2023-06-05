package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioRepository {
	public void insertar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void eliminar(String identificador);
	public Propietario seleccionarPorIdentificador(String identificador);
}
