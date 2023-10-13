package entities;

public class BusinessAccount extends Account {

    private Double loanLimit; //valor máximo de emprestimo


    public BusinessAccount() {
        super();
    }
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }


    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.00; 
        }
    }

    // Chama o metodo withdraw da SuperClasse e em seguida desconta 2.00 da conta
    @Override
    public final void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2.00;
    }


    public Double getLoanLimit() {
        return loanLimit;
    }
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}