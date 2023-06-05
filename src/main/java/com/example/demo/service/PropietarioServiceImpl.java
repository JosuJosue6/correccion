package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService{
	
	@Autowired
	private PropietarioRepository propietarioRepository;
	
	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

	@Override
	public void eliminar(String identificador) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(identificador);
	}

	@Override
	public Propietario buscarPorIdentificador(String identificador) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionarPorIdentificador(identificador);
	}

}
