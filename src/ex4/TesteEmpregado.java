package ex4;

import java.util.*;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		
		Empregado[] listaEmpregados = new Empregado[2];
		Scanner sc = new Scanner(System.in);
		Empregado em = null;
		
		int codigo = 0;
		
		for(int i = 0; i < listaEmpregados.length; i++) {
			
			String nome = null;
			String cpf = null;
			double salario = 0;
			
			System.out.println("Digite o nome do empregado: ");
			nome = sc.nextLine();
			System.out.println("Digite o CPF do empregado: ");
			cpf = sc.nextLine();
			System.out.println("Digite o salário do empregado: ");
			salario = sc.nextDouble();
			
			
			em = new Empregado(nome, cpf, salario);
			
			listaEmpregados[i] = em;
			
			sc.nextLine();
		}
		
		
		
		
		
		
	}
	
}


