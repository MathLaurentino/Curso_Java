package entities;

public final class OutsourcedEmployee extends Employee{
    
    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }
    public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    
    @Override
    public double payment() {
        double payment = super.payment();
        payment += additionalCharge * 1.20;
        return payment;
    }


    public Double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

}
