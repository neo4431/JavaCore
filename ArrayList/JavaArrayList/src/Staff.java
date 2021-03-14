import java.util.Scanner;

public class Staff {
    private int id;
    private String name;
    private String title;
    private String address;
    private Long salary;

    public Staff(int id, String name, String title, String address, Long salary) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.address = address;
        this.salary = salary;
    }

    public Staff() {
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.print("Nhập tên nhân viên: ");
        name = sc.nextLine();
        System.out.print("Nhập chức vụ nhân viên: ");
        title = sc.nextLine();
        System.out.print("Nhập địa chỉ nhân viên: ");
        address = sc.nextLine();
        System.out.print("Nhập mức lương của nhân viên: ");
        salary = Long.valueOf(sc.nextLine());
    }

    public String toString(){
        return "Mã nhân viên: "+id+"\nTên nhân viên: "+ name +
        "\nChức vụ: "+ title + 
        "\nĐịa chỉ: "+ address+"\nMức lương: "+salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getSalary() {
        return salary;
    }
    public void setSalary(Long salary) {
        this.salary = salary;
    }

}
