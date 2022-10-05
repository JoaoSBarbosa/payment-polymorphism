package com.empresa;

public class Assalariado extends Funcionario {
	
	private float salario;
	
	
	// Getter e Setter
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	// Construtor
	public Assalariado(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}
	public Assalariado() {
		
	}
	
	// Método
	@Override
	public float pagamento() {
		return salario;
	}
}
