package com.empresa;

public class Comissionado extends Funcionario{
	
	private float vendas;
	private float comissao;
	
	
	// Getter e Setter
	public float getVendas() {
		return vendas;
	}
	public void setVendas(float vendas) {
		this.vendas = vendas;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}


	// Construtores
	public Comissionado(String nome, float vendas, float comissao) {
		super(nome);
		this.vendas = vendas;
		this.comissao = comissao;
	}
	public Comissionado() {
		
	}
	
	// métodos
	@Override
	public float pagamento() {
		return vendas*comissao;
	}
}
