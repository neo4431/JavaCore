import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập n: ");
        int n = sc.nextInt();
        Person[] person = new Person[n];
        for(int i=0 ; i< n; i++) {
            person[i] = new Student();
            person[i].input();
            person[i].display();
        }
        sc.close();
    }
}
