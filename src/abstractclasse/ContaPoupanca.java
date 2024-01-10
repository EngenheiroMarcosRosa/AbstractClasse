
package abstractclasse;


public class ContaPoupanca extends Conta {
    
    @Override
    public void verValor(){
        System.out.println("Conta Poupança"+(this.total+500));
    }

    @Override
    int depositar() {
      return this.total*5;  
    }
}
