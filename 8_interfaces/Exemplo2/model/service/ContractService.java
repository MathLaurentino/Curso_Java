package model.service;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

    OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {

        Double basicAmount = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            Double amount = basicAmount;
            amount += paymentService.interest(basicAmount, i);
            amount += paymentService.paymentFree(amount);
            Installment installment = new Installment(contract.getDate().plusMonths(i), amount);
            contract.addInstallment(installment);
        }

    }
}
