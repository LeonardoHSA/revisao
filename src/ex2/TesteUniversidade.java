package ex2;

public class TesteUniversidade {
	
public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
     
        Universidade nj = new Universidade("Princeton");
        nj.addDepartamentos("Pesquisas cientificas", nj);
        nj.addDepartamentos("Filosofia", nj);
        
        Universidade cb = new Universidade("Cambridge");
        cb.addDepartamentos("Educação física", cb);
        cb.addDepartamentos("RH", cb);
        
        p1.insertNomeUniDep("Albert Einstein", nj, nj.getListaDepartamentos().get(0),  "14/3/1879");
        p2.insertNomeUniDep("Isaac Newton", cb, cb.getListaDepartamentos().get(1),  "4/1/1643");
        
        p1.status();
        p2.status();
        
       
        
        
        
        
        
        
        
    }
}
