import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class AppHeranca {
    
    public static void main(String[] args) {
        
        BusinessAccount bac1 = new BusinessAccount(190, "Marcos", 10000.00, 10000.00);
        
        // UPCASTING
        
        /**
         * Converção de SubClasse para SuperClasse é natural
         */
        Account ac1 = bac1;
        Account ac2 = new BusinessAccount(200, "Matheus", 1000.00, 300.00);
        Account ac3 = new SavingsAccount(201, "Maria", 1000.00, 0.01);


        // DOWNCASTING

        /**
         * É necessario forçar a converção de uma SuperClasse para SubClasse
         * Da forma que foi feita, tanto bac2 quanto ac2 apontam para o mesmo objeto (ponteiro)
         */
        BusinessAccount bac2 = (BusinessAccount) ac2;
        bac1.loan(300);
        System.out.println("bac2 balance: " + bac2.getBalance()); // bac2 balance: 1290
        System.out.println("ac2 balance: " + ac1.getBalance()); // ac2 balance: 1290

        // So da erro na hora de compilar:
        // BusinessAccount bac3 = (BusinessAccount) ac3;
        if (ac3 instanceof BusinessAccount) { // false
            BusinessAccount bac3 = (BusinessAccount) ac3;
            bac3.loan(200);
        }

    }

}
