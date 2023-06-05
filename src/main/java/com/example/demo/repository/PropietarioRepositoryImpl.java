package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{

	private List<Propietario> baseDatos = new ArrayList<>();
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.eliminar(propietario.getIdentificacion());
		this.insertar(propietario);
	}

	@Override
	public void eliminar(String identificador) {
		// TODO Auto-generated method stub
		Propietario propietario = this.seleccionarPorIdentificador(identificador);
		baseDatos.remove(propietario);
	}

	@Override
	public Propietario seleccionarPorIdentificador(String identificador) {
		// TODO Auto-generated method stub
		Propietario propietarioEncontrado = new Propietario();
		for(Propietario propietario: baseDatos) {
			if(identificador.equals(propietario.getIdentificacion())) {
				propietarioEncontrado = propietario;
			}
		}
		return propietarioEncontrado;
	}

}
