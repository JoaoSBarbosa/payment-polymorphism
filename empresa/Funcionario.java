package com.empresa;

public class Funcionario {
	
	private String nome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public Funcionario(String nome) {
		this.nome= nome;
	}
	public Funcionario() {
		
	}
	public float pagamento() {
		System.out.println("Pagamento");
		return 0.0f;
	}

}
