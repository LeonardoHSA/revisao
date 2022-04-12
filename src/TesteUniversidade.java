
public class TesteUniversidade {
	
public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        Universidade nj = new Universidade();
        nj.setNome("Princeton");
        
        Universidade cb = new Universidade();
        cb.setNome("Cambridge");
        
        p1.insertNomeUni("Albert Einstein", nj, "14/3/1879");
        p2.insertNomeUni("Isaac Newton", cb, "4/1/1643");
        
        p1.status();
        p2.status();
        
        
    }
}
