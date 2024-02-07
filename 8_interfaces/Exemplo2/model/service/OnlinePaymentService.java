package model.service;

public interface OnlinePaymentService {

    public Double paymentFree(Double amount);
    
    // juro
    public Double interest(Double amount, Integer months);

}
