import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int id, age, overTime, errorFound;
        String name, phone, email;
        long basicSalary;

        Dev dv = new Dev();
        System.out.printf("Nhập mã nhân viên: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập họ tên lập trình viên: ");
        name = sc.nextLine();
        System.out.printf("Nhập tuổi lập trình viên: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập số điện thoại lập trình viên: ");
        phone = sc.nextLine();
        System.out.printf("Nhập email lập trình viên: ");
        email = sc.nextLine();
        System.out.printf("Nhập lương cơ bản của lập trình viên: ");
        basicSalary = Long.valueOf(sc.nextLine());
        System.out.printf("Nhập số giờ tăng ca của lập trình viên: ");
        overTime = Integer.valueOf(sc.nextLine());

        dv.setId(id);
        dv.setName(name);
        dv.setAge(age);
        dv.setPhone(phone);
        dv.setEmail(email);
        dv.setBasicSalary(basicSalary);
        dv.setOverTime(overTime);
        System.out.println("---------------------------------------------");
        dv.display();
        System.out.println("---------------------------------------------");
        QA qa = new QA();
        System.out.printf("Nhập mã nhân viên: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập họ tên kiểm chứng viên: ");
        name = sc.nextLine();
        System.out.printf("Nhập tuổi kiểm chứng viên: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập số điện thoại kiểm chứng viên: ");
        phone = sc.nextLine();
        System.out.printf("Nhập email kiểm chứng viên: ");
        email = sc.nextLine();
        System.out.printf("Nhập lương cơ bản của kiểm chứng viên: ");
        basicSalary = Long.valueOf(sc.nextLine());
        System.out.printf("Nhập số lỗi tìm được của kiểm chứng viên: ");
        errorFound = sc.nextInt();

        qa.setId(id);
        qa.setName(name);
        qa.setAge(age);
        qa.setPhone(phone);
        qa.setEmail(email);
        qa.setBasicSalary(basicSalary);
        qa.setErrorFound(errorFound);
        System.out.println("---------------------------------------------");
        qa.display();

        sc.close();
    }
}
