public class Waiter extends Employee{
    private Long compensate;
    
    public Waiter(int id, String name, int age, Long basicSalary, Long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }
    public Waiter() {
    }
    public Long getCompensate() {
        return compensate;
    }
    public void setCompensate(Long compensate) {
        this.compensate = compensate;
    }
    @Override
    public String toString() {
        return super.toString() + "\nCompensate: " + compensate;
    }
    @Override
    public Long calculatorSalary() {
        // TODO Auto-generated method stub
        return this.compensate + getBasicSalary();
    }
    
}
