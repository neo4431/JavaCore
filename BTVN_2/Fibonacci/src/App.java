import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Viết chương trình cho phép nhập vào một số nguyên dương n, liệt kê n số Fibonacci đầu tiên.
        Scanner scanner = new Scanner(System.in);
        int n,num1,num2,num3;
        System.out.println("Nhập số nguyên dương (n) bất kỳ: ");
        n = scanner.nextInt();
        num1 = 0;
        num2 = 1;
        if (n <= 0){
            System.out.println("Số phải lớn hơn 0 (n>0)");
        } else if(n == 1){
            System.out.println("Dãy Fibonacci: \n" + num1);
        } else if(n == 2){
            System.out.println("Dãy Fibonacci: \n" + num1 + "\n" + num2);
        } else {
            System.out.println("Dãy Fibonacci: \n" + num1 + "\n" + num2);
            for(int i = 0 ; i < n - 2; i++){
                num3 = num1 + num2;
                System.out.println(num3);
                num1 = num2;
                num2 = num3;
            }
        }
        scanner.close();
    }
}
