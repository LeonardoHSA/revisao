package ex4;

import java.util.Iterator;

import ex3.Aluno;

public class Empregado {

	private String nome;
	private String cpf;
	private double salario;
	
	public Empregado(String nome, String cpf, double salario) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void status() {
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Salario: " + this.getSalario());
	}
	
}
