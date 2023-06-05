package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository{
	
	private List<Matricula> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Matricula matricula) {
		baseDatos.add(matricula);
		
	}

	@Override
	public void actualizar(Matricula matricula) {
		this.eliminar(matricula.getPropietario().getIdentificacion());
		this.insertar(matricula);
		
	}

	@Override
	public void eliminar(String propietarioIdentificador) {
		Matricula cuenta = this.seleccionarPorPropietario(propietarioIdentificador);
		baseDatos.remove(cuenta);
	}

	@Override
	public Matricula seleccionarPorPropietario(String propietarioIdentificador) {
		Matricula matriculaEncontrada = new Matricula();
		for(Matricula matricula: baseDatos) {
			if(propietarioIdentificador.equals(matricula.getPropietario().getIdentificacion())) {
				matriculaEncontrada = matricula;
				//System.out.println(cuentaEncontrada);
				
			}else {
				//System.out.println("USUARIO NO EXISTENTE EN LA BASE DE DATOS.");
			}
		}
		return matriculaEncontrada;
	}
}
