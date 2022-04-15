package ex3;

import java.util.*;

public class TesteEx3 {

	public static void main(String[] args) {

		int codigo = 0;
		int codigoLista = 0;
		Scanner sc = new Scanner(System.in);
		Pessoa p = null;
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		Aluno a = null;
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

		do {

			System.out.println(
					"Para instanciar uma pessoa digite 1, para instanciar um aluno digite 2, digite 0 para sair...");
			System.out.println("Insira o código...");
			codigo = sc.nextInt();
			sc.nextLine();

			if (codigo == 1) {
				String nome = null;
				int idade = 0;

				System.out.println("Digite um nome para a pessoa: ");
				nome = sc.nextLine();
				System.out.println("Digite uma idade para a pessoa: ");
				idade = sc.nextInt();

				p = new Pessoa(nome, idade);
				listaPessoas.add(p);
			} else if (codigo == 2) {

				String nome = null;
				int idade = 0;
				String curso = null;

				System.out.println("Digite o nome do aluno: ");
				nome = sc.nextLine();
				System.out.println("Digite a idade do aluno: ");
				idade = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite o nome do cruso do aluno: ");
				curso = sc.nextLine();

				a = new Aluno(nome, idade, curso);
				listaAlunos.add(a);
			}

			System.out.println("Que lista você deseja visualizar ?");
			System.out.println("Digite 1 para a lista de pessoas e 2 para a lista de alunos, digite 0 para sair");
			codigoLista = sc.nextInt();

			if (codigoLista == 1) {

				Iterator<Pessoa> itp = listaPessoas.iterator();

				while (itp.hasNext()) {
					System.out.println("===========================");
					p = itp.next();
					p.mostraDados();
					System.out.println("===========================");
				}
			} else if(codigoLista == 2) {
				
				Iterator<Aluno> ita = listaAlunos.iterator();

				while (ita.hasNext()) {
					System.out.println("===========================");
					a = ita.next();
					a.mostraDados();
					System.out.println("===========================");
				}
			}

			if (codigo == 0 || codigoLista == 0) {
				System.out.println("Saindo do programa");
			}
		} while (codigo != 0);
	}
}
