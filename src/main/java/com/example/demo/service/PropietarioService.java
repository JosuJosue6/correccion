package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {
	public void agregar(Propietario propietario);
	public void actualizar(Propietario propietario);
	public void eliminar(String identificador);
	public Propietario buscarPorIdentificador(String identificador);
}
