import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 3 Viết chương trình nhập từ bàn phím số nguyên dương n và hiển thị ra màn hình n!
        // Ví dụ: nhập n = 5 thì kết quả 5! = 120 (1*2*3*4*5 = 120)
        Scanner scanner = new Scanner(System.in);
        int n,result;
        System.out.println("Nhập 1 số nguyên dương(n) bất kỳ: ");
        n = scanner.nextInt();
        result = 1;
        if (n <= 0){
            System.out.println("Số đó phải lớn hơn 0 (n > 0)");
        } else {
            for( int i = 1 ; i <= n; i++){
                result *= i;
            }
            System.out.printf("%d! = %d \n",n ,result);
        }
        scanner.close();
    }
}
