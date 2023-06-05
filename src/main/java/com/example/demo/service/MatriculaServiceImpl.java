package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepository matriculaRepository;
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	@Override
	public void agregar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void eliminar(String propietarioIdentificador) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(propietarioIdentificador);
	}

	@Override
	public Matricula buscar(String propietarioIdentifica) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionarPorPropietario(propietarioIdentifica);
	}

	@Override
	public void realizarMatricula(String propietario, String placa) {
		// TODO Auto-generated method stub
		Propietario propietarioV = this.propietarioRepository.seleccionarPorIdentificador(propietario);
		Vehiculo vehiculo = this.vehiculoRepository.seleccionarPorPlaca(placa);
		
	}

}
