public class Student extends Person{
    private double gpa;

    public Student(int id, String name, int age, String address, double gpa) {
        super(id, name, age, address);
        this.gpa = gpa;
    }

    public Student() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + gpa +"\n";
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    
}
