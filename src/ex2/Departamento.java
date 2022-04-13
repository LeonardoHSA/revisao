package ex2;

public class Departamento {
	
	private String nome;
	private Universidade uni;
	
	public Departamento(String nomeDep, Universidade uni) {
		
		this.nome = nomeDep;
		this.uni = uni;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUni() {
		return uni;
	}

	public void setUni(Universidade uni) {
		this.uni = uni;
	}
	
	
}
