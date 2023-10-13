import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/** SOBRE POLIMORFISMO
 * Em Programação Orientada a Objetos, polimorfismo é recurso que 
 * permite que variáveis de um mesmo tipo mais genérico possam 
 * apontar para objetos de tipos específicos diferentes, tendo assim 
 * comportamentos diferentes conforme cada tipo específico.
 */

public class AppPolimorfismo {
    
    public static void main(String[] args) {
 
        Account x = new BusinessAccount(1020, "Marcos", 1000.0, 10000.00);
        Account y = new SavingsAccount(1021, "Ilsuka", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println("x: " + x.getBalance()); // x: 943.0
        System.out.println("y: " + y.getBalance()); // y: 950.0

        /**
         *  A associação do tipo específico com o tipo genérico é feita em tempo de 
         * execução (upcasting).
         * 
         * O compilador não sabe para qual tipo específico a chamada do método 
         * Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account)
         */
        
    }

}
