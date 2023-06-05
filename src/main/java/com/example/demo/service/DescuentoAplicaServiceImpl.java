package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("descuento")
public class DescuentoAplicaServiceImpl implements DescuentoService{

	@Override
	public BigDecimal descuento(BigDecimal valorMatricula) {
		BigDecimal descuento = valorMatricula.multiply(new BigDecimal(.09));
		return valorMatricula.subtract(descuento);
	}

}
