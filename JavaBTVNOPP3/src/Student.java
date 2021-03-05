import java.util.Scanner;
public class Student extends Person {
    private int id;
    private double cPA;
    private String email;

    public Student(String name, String gender, String address, String dOB, int id, double cPA, String email) {
        super(name, gender, address, dOB);
        this.id = id;
        this.cPA = cPA;
        this.email = email;
    }

    public Student() {
    }

    public void display() {
        System.out.println("----------Thông tin sinh viên------------");
        System.out.println("Mã SV: "+ id);
        super.display();
        System.out.println("CPA: "+ cPA);
        System.out.println("Email: "+ email);
        System.out.println("---------------------------------------------"); 
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.printf("Nhập mã sinh viên: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập CPA: ");
        cPA = Double.valueOf(sc.nextLine());
        System.out.printf("Nhập email: ");
        email = sc.nextLine();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getCPA() {
        return cPA;
    }
    public void setCPA(double cPA) {
        this.cPA = cPA;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
