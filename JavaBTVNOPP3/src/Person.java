import java.util.Scanner;
public class Person {
    private String name, gender, address, dOB;

    public Person(String name, String gender, String address, String dOB) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dOB = dOB;
    }

    public Person() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.printf("Nhập giới tính: ");
        gender = sc.nextLine();
        System.out.printf("Nhập địa chỉ: ");
        address = sc.nextLine();
        System.out.printf("Nhập ngày tháng năm sinh theo định dạng \"dd/MM/yy\": ");
        dOB = sc.nextLine();
    }

    public void display(){
        System.out.println("Họ tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Ngày tháng năm sinh: " + dOB);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDOB() {
        return dOB;
    }
    public void setDOB(String dOB) {
        this.dOB = dOB;
    }
    
}
