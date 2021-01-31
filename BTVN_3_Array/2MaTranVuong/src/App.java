import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 2 Viết chương trình nhập vào 2 ma trận vuông A và B , in mảng đó ra màn hình.
        // Thực hiện cộng 2 ma trận
        // Tìm ma trận chuyển vị của 2 ma trận đó
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Nhap số hàng/số cột cho ma trận vuông thứ 1: ");
        m = sc.nextInt();
        System.out.println("Nhap số hàng/số cột cho ma trận vuông thứ 2: ");
        n = sc.nextInt();
        int arrA[][] = new int[m][m];
        int arrB[][] = new int[n][n];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.println("Nhap arrA[" + i + "][" + j + "]:");
                arrA[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.println("Nhap arrB[" + i + "][" + j + "]:");
                arrB[i][j] = sc.nextInt();
            }
        }
        // in mảng
        System.out.println("Ma trận vuông thứ nhất: ");
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("");
            for (int j = 0; j < arrA.length; j++) {
                System.out.print(arrA[i][j] + "\t");
            }
        }
        System.out.println("\nMa trận vuông thứ hai: ");
        for (int i = 0; i < arrB.length; i++) {
            System.out.println("");
            for (int j = 0; j < arrB.length; j++) {
                System.out.print(arrB[i][j] + "\t");
            }
        }
        System.out.println("");
        // Cộng 2 ma trận
        if (m == n) {
            int totalArr[][] = new int[m][m];
            System.out.println("\nTổng 2 ma trận vuông: ");
            for (int i = 0; i < totalArr.length; i++) {
                System.out.println("");
                for (int j = 0; j < totalArr[i].length; j++) {
                    totalArr[i][j] = arrA[i][j] + arrB[i][j];
                    System.out.print(totalArr[i][j] + "\t");
                }
            }
            System.out.println("");
        } else {
            System.out.println("Không thể cộng 2 ma trận không cùng cấp");
        }
        // 2 ma trận chuyển vị:
        int ele;
        System.out.println("Ma trận thứ nhất chuyển vị: ");
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("");
            for (int j = 0; j < arrA[i].length; j++) {
                if (i < j) {
                    ele = arrA[i][j];
                    arrA[i][j] = arrA[j][i];
                    arrA[j][i] = ele;
                }
                System.out.print(arrA[i][j] + "\t");
            }
        }
        System.out.println("\nMa trận thứ hai chuyển vị: ");
        for (int i = 0; i < arrB.length; i++) {
            System.out.println("");
            for (int j = 0; j < arrB[i].length; j++) {
                if (i < j) {
                    ele = arrB[i][j];
                    arrB[i][j] = arrB[j][i];
                    arrB[j][i] = ele;
                }
                System.out.print(arrB[i][j] + "\t");
            }
        }
        System.out.println("");
        sc.close();
    }
}
