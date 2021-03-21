public class Kitchen extends Employee{
    private Long serviceCharge;

    public Kitchen(int id, String name, int age, Long basicSalary, Long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public Kitchen() {
    }

    @Override
    public Long calculatorSalary() {
        // TODO Auto-generated method stub
        return serviceCharge + getBasicSalary();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nService Charge: "+ serviceCharge;
    }
    public Long getServiceCharge() {
        return serviceCharge;
    }
    public void setServiceCharge(Long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }  
}
