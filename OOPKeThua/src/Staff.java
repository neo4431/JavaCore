public class Staff {

    private int id;
    private String name;
    private int age;
    private String phone;
    private String email;
    private long basicSalary;
    
    public Staff(){
    }
    
    public Staff(int id, String name, int age, String phone, String email, long basicSalary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public void display(){
        System.out.println("Mã nhân viên: " + id);
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Số điện thoại: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Lương cơ bản: " + basicSalary);
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

}
