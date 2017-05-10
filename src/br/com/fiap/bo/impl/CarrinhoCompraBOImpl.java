package br.com.fiap.bo.impl;

import javax.ejb.Stateful;

import br.com.fiap.bo.CarrinhoCompraBO;

@Stateful
public class CarrinhoCompraBOImpl implements CarrinhoCompraBO {
	
	private double totalBitcoin;
	
	@Override
	public double adiconarBitCoin(double bitcoin){
		return totalBitcoin = totalBitcoin + bitcoin;
	}
	
}
