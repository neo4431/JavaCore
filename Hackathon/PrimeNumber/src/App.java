import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Câu 1: Kiểm tra một số nhập vào từ bàn phím có phải là số nguyên tố hay
        // không?
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listConsole = new ArrayList<String>();
        boolean isNonStop = true;
        
        while (isNonStop) {
            System.out.print("Nhập số: ");
            try {
                int num = sc.nextInt();
                if (checkPrimeNumber(num)) {
                    System.out.println(num + " là số nguyên tố");
                    listConsole.add(num + " là số nguyên tố");
                } else {
                    System.out.println(num + " không phải là số nguyên tố");
                    listConsole.add(num + " không phải là số nguyên tố");
                }
            } catch (Exception e) {
                String str = String.valueOf(sc.nextLine());
                if (str.equals("X") || str.equals("Q")) {
                    stop = false;
                } else {
                    System.out.println(str + " không phải là số");
                    listConsole.add(str + " không phải là số");
                }
            }
        }
        File file = new File("E:\\Lập Trình\\JavaCore\\Hackathon\\PrimeNumber\\nguyento.txt");
        FileWriter fileWrite = new FileWriter(file);
        for (String str : listConsole) {
            fileWrite.write(str+"\n");
        }
        fileWrite.close();
        sc.close();
    }

    public static boolean checkPrimeNumber(int num) {
        if (num < 2)
            return false;
        if (num >= 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
