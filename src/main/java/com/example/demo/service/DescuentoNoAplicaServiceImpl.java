package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("sinDescuento")
public class DescuentoNoAplicaServiceImpl implements DescuentoService{

	@Override
	public BigDecimal descuento(BigDecimal valorMatricula) {
		// TODO Auto-generated method stub
		return valorMatricula;
	}

}
