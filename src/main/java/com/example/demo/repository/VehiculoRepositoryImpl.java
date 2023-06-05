package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{
	
	private List<Vehiculo> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		Vehiculo cuenta = this.seleccionarPorPlaca(placa);
		baseDatos.remove(cuenta);
	}

	@Override
	public Vehiculo seleccionarPorPlaca(String placa) {
		Vehiculo vehiculoEncontrado = new Vehiculo();
		for(Vehiculo vehiculo: baseDatos) {
			if(placa.equals(vehiculo.getPlaca())) {
				vehiculoEncontrado = vehiculo;
				//System.out.println(cuentaEncontrada);
				
			}else {
				//System.out.println("USUARIO NO EXISTENTE EN LA BASE DE DATOS.");
			}
		}
		return vehiculoEncontrado;
	}
	
}
