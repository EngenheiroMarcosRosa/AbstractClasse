
package abstractclasse;


public abstract class Conta {
    
    protected int total = 100;
    
    public void verValor(){
        
        System.out.println(this.total);
    }
   
    abstract int depositar();
        
    
}
