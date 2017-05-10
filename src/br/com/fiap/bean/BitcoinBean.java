package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoCompraBO;

@ManagedBean
@SessionScoped
public class BitcoinBean {
	
	private float totalBitcoin, bitcoin;
	
	@EJB
	private CarrinhoCompraBO bo;

	public void adicionar(){
		totalBitcoin = (float) bo.adiconarBitCoin(bitcoin);
	}

	

	public float getTotalBitcoin() {
		return totalBitcoin;
	}



	public void setTotalBitcoin(float totalBitcoin) {
		this.totalBitcoin = totalBitcoin;
	}



	public float getBitcoin() {
		return bitcoin;
	}

	public void setBitcoin(float bitcoin) {
		this.bitcoin = bitcoin;
	}

	

	

	public BitcoinBean(float totalBitcoin, float bitcoin, CarrinhoCompraBO bo) {
		super();
		this.totalBitcoin = totalBitcoin;
		this.bitcoin = bitcoin;
		this.bo = bo;
	}

	public BitcoinBean() {
		super();
	}
	
	
	
}
