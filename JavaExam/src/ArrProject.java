import java.util.Scanner;

public class ArrProject {

    public int[] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        if (n > 8 && n < 14) {
            int[] arr = new int[n];
            int[] arrRandom = {-11, 11};
            for (int i = 0; i < n; i++) {
                double ele = Math.random() * arrRandom[(int) Math.round(Math.random())];
                arr[i] = (int) ele;
            }
            return arr;
        } else {
            System.out.println("N phải lớn hơn 8 và nhỏ hơn 14");
        }
        return null;
    }

    public void timCapSo(int arr[]) {
        System.out.println("");
        System.out.print("Nhập X: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < -10 && x > 10) {
            System.out.println("N phải lớn hơn hoặc bằng -10 và nhỏ hơn hoặc bằng 10");
        } else {
            int khoangCach = 21;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int sum = arr[i] + arr[j];
                    if (Math.abs(sum - x) <= khoangCach) {
                        khoangCach = Math.abs(sum - x);
                    }
                }
            }
            System.out.println("Các cặp số có tổng gần X nhất");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] - x == khoangCach) {
                        System.out.println(arr[i] + ", " + arr[j]);
                    }
                }
            }
        }
    }

    public void xuatMang(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
