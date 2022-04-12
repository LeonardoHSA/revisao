package ex2;

public class Pessoa {
	
	private Universidade uni;
    private String nome;
    private String dataNascimento;
    private Departamento dep;

    public Universidade getUni() {
        return uni;
    }

    public void setUni(Universidade uni) {
        this.uni = uni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void insertNomeUni(String nome, Universidade uni, String dataNascimento){
        
        this.nome = nome;
        this.uni = uni;
        this.dataNascimento = dataNascimento;
    }
    
    public void status(){
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Universidade: " + this.getUni().getNome());
        System.out.println("Data de nascimento: " + this.getDataNascimento());
        System.out.println("===================================");
    }
}
