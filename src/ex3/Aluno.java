package ex3;

public class Aluno extends Pessoa {

	private String curso;

	public Aluno(String nome, int idade, String cruso) {

		super(nome, idade);
		this.curso = cruso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void mostraDados() {
		
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Curso: " + this.getCurso());
	}
}
