package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automatico")
public class TipoVehiculoAutomaticoServiceImpl implements TipoVehiculoService {

	@Override
	public BigDecimal valorMatricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(.15));
		return valorMatricula;
	}

}
