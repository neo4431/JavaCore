import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1 Viết chương trình nhập vào một mảng gồm n số nguyên và thực hiện các công
        // việc sau:
        // Xuất các giá trị của mảng ra
        // Tìm min, max
        // Tìm và đếm các số chẵn trong mảng
        // Tìm các số nguyên tố có trong mảng
        // Sắp xếp mảng theo thứ tự tăng dần
        // Sắp xếp theo thứ tự giảm dần
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập độ dài của mảng: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Độ dài của mảng phải lớn hơn 0");
        } else {
            int arr[] = new int[n];
            // Nhập phần tử:
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
                arr[i] = sc.nextInt();
            }
            // In mảng
            System.out.print("Mảng arr: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("");
            // Tìm min, max
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.printf("Max = %d \nMin = %d \n", max, min);
            // Tìm và đếm số chẵn
            System.out.print("Số chẵn trong mảng: ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + "\t");
                }
            }
            System.out.println("");
            // Tìm các số nguyên tố
            System.out.print("Số nguyên tố trong mảng: ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 2) {
                    System.out.print(arr[i] + "\t");
                } else {
                    for (int j = 2; j < arr[i]; j++) {
                        if (arr[i] < 1 || (arr[i] % j == 0 && arr[i] != 2)) {
                            break;
                        } else if (j == 2) {
                            System.out.print(arr[i] + "\t");
                        }
                    }
                }
            }
            System.out.println("");
            // Sắp xêp mảng theo thứ tự tăng dần
            int intNum;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        intNum = arr[i];
                        arr[i] = arr[j];
                        arr[j] = intNum;
                    }
                }
            }
            System.out.print("Mảng tăng dần: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("");
            // Sắp xếp mảng theo thứ tự giảm dần
            System.out.print("Mảng giảm dần: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + "\t");
            }
        }
        sc.close();
    }
}
