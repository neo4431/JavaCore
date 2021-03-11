import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Chu vi hình tròn = "+ circle.tinhChuVi());
        System.out.println("Diện tích hình tròn = "+ circle.tinhDienTich());
        System.out.println("Đường kính hình tròn = "+ circle.tinhDuongKinh());
        System.out.printf("Nhập chiều dài hình chữ nhật: ");
        double length = sc.nextDouble(); 
        System.out.printf("Nhập chiều rộng hình chữ nhật: ");
        double width = sc.nextDouble(); 
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Chu vi hình chữ nhật = "+ rect.tinhChuVi());
        System.out.println("Diện tích hình chữ nhật = "+ rect.tinhDienTich());
        System.out.println("Đường chéo hình chữ nhật = "+ rect.tinhDuongCheo());
        sc.close();
    }
}
