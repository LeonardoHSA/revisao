package ex2;

import java.util.ArrayList;

public class Universidade {
	
	private String nome;
	
	private ArrayList<Departamento> listaDepartamentos;
	
	public Universidade() {
		
		this.listaDepartamentos = new ArrayList<Departamento>();
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public ArrayList<Departamento> getListaDepartamentos() {
		return listaDepartamentos;
	}

	public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
		this.listaDepartamentos = listaDepartamentos;
	}
    
	public void addDepartamentos(String nomeDep) {
		
		Departamento dep;
		
		listaDepartamentos.add(dep = new Departamento(nomeDep));
	}
    
}
