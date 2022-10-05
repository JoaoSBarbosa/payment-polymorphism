package com.empresa;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Mario");
		Funcionario f2 = new Assalariado("Luigi",3500);
		Funcionario f3 = new Horista("Yoshi",220.15f,10.50f);
		Funcionario f4 = new Comissionado("Sonic",24.f,150.f);
		
		Funcionario funcionarios [] = { new Assalariado("Goku",10000.f),
										new Horista("Gohan",220.0f,100.00f),
										new Comissionado("Vegeta",50000.0f,0.10f)
		                               };
		System.out.println("***********IMPRESSÃO 01***************\n");
		System.out.println("-FUNCIONÁRIOS-\n");
		System.out.println(
		f1.getNome()+"\n"+
		f2.getNome()+"\n"+
		f3.getNome()+"\n"+
		f4.getNome());
		System.out.println("\n--Assalariado--\n");
		System.out.println("Funcionário: " + f2.getNome( )+ 
				"\nPagamento: R$ "+String.format("%.2f", f2.pagamento()));
		System.out.println("\n-Horista-\n");
		System.out.println("Funcionário: " + f3.getNome( )+ 
				"\nPagamento: R$ "+String.format("%.2f", f3.pagamento()));
		System.out.println("\n-Comissionado-\n");
		System.out.println("Funcionario: " + f4.getNome( )+ 
				"\nPagamento: R$ "+String.format("%.2f", f4.pagamento()));
		
		System.out.println("\n***********IMPRESSÃO 02***************\n");

		float total =0;
		Funcionario f;
		for(int i =0; i<funcionarios.length; i++) {
			f = funcionarios[i];
			System.out.println("Funcionário: "+f.getNome()+ "\nSalario: R$ "+String.format("%.2f", f.pagamento())+"\n------------------");
			total += f.pagamento();
		}
		System.out.println("\nTotal de pagamentos: "+ String.format("%.2f", total));
		}
	
	
	
	
		
	
		
	}


