package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.EnqueteBO;

@ManagedBean
@SessionScoped
public class EnqueteBean {

	@EJB
	private EnqueteBO bo;
	
	private int sim, nao;
	
	private int totalE, totalD;
	
	@PostConstruct
	private void init(){
		apurarResultados();
	}
	
	private void apurarResultados() {
		// TODO Auto-generated method stub
		
	}

	public void votarE(){
		bo.votarEnterprise();
		apurarResultados();
	}
	
	public void votarD(){
		bo.votarEnterprise();
		apurarResultados();
	}
	
	
	
	public void votarSim(){
		sim = bo.votarSim();
	}
	
	public void votarNao(){
		nao = bo.votarNao();
	}

	public int getSim() {
		return sim;
	}

	public void setSim(int sim) {
		this.sim = sim;
	}

	public int getNao() {
		return nao;
	}

	public void setNao(int nao) {
		this.nao = nao;
	}
	
}