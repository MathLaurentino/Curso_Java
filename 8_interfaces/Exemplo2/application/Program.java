package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Integer number = 8028;
        LocalDate date = LocalDate.parse("25/06/2018", fmt);
        Double totalValue = 600.0;
        Integer months = 3;

        Contract contract = new Contract(number, date, totalValue);

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);

        List<Installment> InstallmentList = contract.getInstallment();

        for (Installment installment : InstallmentList) {
            System.out.println("Mes: " + installment.getDueDate());
            System.out.println("Valor: " + String.format("%.2f", installment.getAmount()));
        }
    }   
}
