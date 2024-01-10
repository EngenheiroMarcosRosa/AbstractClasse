
package abstractclasse;


public class ContaCorrente extends Conta{
    
    @Override
    public void verValor(){
        System.out.println("Conta corrente"+(this.total+200));
    }
    
    @Override
    int depositar(){
        
        return this.total *2;
        
    }
   
}
