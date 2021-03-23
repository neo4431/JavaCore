public class Teacher extends Person{
    private Long salary;

    public Teacher(int id, String name, int age, String address, Long salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public Teacher(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + salary +"\n";
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    
}
