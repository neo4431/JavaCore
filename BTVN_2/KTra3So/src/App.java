import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Viết chương trình nhập vào 3 số
        // Kiểm tra xem 3 số này có phải cạnh của một tam giác
        // (Điều kiện tổng 2 cạnh phải lớn hơn cạnh còn lại)
        Double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        num1 = scanner.nextDouble();
        System.out.println("Nhập số thứ hai: ");
        num2 = scanner.nextDouble();
        System.out.println("Nhập số thứ ba: ");
        num3 = scanner.nextDouble();
        if(num1 < num2 + num3 || num2 < num1 + num3 || num3 < num1 + num2){
            System.out.println("3 số trên là cạnh của một tam giác");
        } else {
            System.out.println("3 số trên không phải là cạnh của một tam giác");
        }
        scanner.close();
    }
}
