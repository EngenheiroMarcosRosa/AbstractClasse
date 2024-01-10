package abstractclasse;


public class AbstractClasse {

        public static void main(String[] args) {
        // TODO code application logic here
        Conta c;       
        c = new ContaCorrente();
        c.verValor();
        System.out.println( c.depositar());
        
        c = new ContaPoupanca();
        c.verValor();
        System.out.println(c.depositar());
            
            
       
    }
    
}
