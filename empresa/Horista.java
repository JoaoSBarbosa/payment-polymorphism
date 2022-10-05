package com.empresa;

public class Horista extends Funcionario{
	private float horasTrabalhadas;
	private float valorHora;

	
	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public Horista(String nome, float horasTrabalhadas, float valorHora) {
		super(nome);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	@Override
	public float pagamento() {
		return horasTrabalhadas * valorHora;
	}
	
	
	
	
}
