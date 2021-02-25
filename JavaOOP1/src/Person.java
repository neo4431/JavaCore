// import java.lang.reflect.Constructor;

public class Person {
    // Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3 (Bằng
    // constructor mặc định). Đối tượng sv4 (Bằng constructor có tham số)
    String name;
    int age;
    String address;
    
    public Person(){
        System.out.println("Tao doi tuong bang constructor mac dinh");
    }
    
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Tao doi tuong bang constructor co tham so");
    }

    public void display(){
        System.out.printf("Ten: %s \t Tuoi: %d \t Dia chi: %s. \n",name,age,address);
    }

    public static void main(String[] args){
        Person sv1 = new Person();
        sv1.name = "Nguyen Van A";
        sv1.age = 18;
        sv1.address = "Ha Noi";
        Person sv2 = new Person();
        sv2.name = "Nguyen Van B";
        sv2.age = 19;
        sv2.address = "Ha Nam";
        Person sv3 = new Person();
        sv3.name = "Nguyen Van C";
        sv3.age = 21;
        sv3.address = "Lao Cai";
        Person sv4 = new Person("Nguyen Van D", 24, "Bac Giang");
        sv1.display();
        sv2.display();
        sv3.display();
        sv4.display();
    }
}
