import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số lượng phần tử phải lớn hơn 0");
        } else {
            int arr[] = new int[n];
            int arrDesc[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
                arr[i] = sc.nextInt();
                arrDesc[i] = arr[i];
            }
            // in mảng:
            System.out.println("Mảng arr: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("");
            // Sắp xếp phần tử mảng theo thứ tự giảm dần
            int num;
            for (int i = 0; i < arrDesc.length - 1; i++) {
                for (int j = i+1; j < arrDesc.length; j++) {
                    if (arrDesc[i] < arrDesc[j]) {
                        num = arrDesc[i];
                        arrDesc[i] = arrDesc[j];
                        arrDesc[j] = num;
                    }
                }
            }
            System.out.println("Mảng arr theo thứ tự giảm dần: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arrDesc[i] + "\t");
            }
            System.out.println("");

            // Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
            int max1 = arr[0];
            int max2 = arr[0];
            for(int i = 0; i < arr.length; i++){
                if (max1 <= arr[i]){
                    max1 = arr[i];
                }
            }
            System.out.println("---------------");
            System.out.println("Phần tử lớn nhất là: " + max1);
            System.out.println("Các chỉ số trong mảng của số lớn nhất là: ");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == max1){
                    System.out.println(i);
                }
            }
            for(int i = 0; i < arr.length; i++){
                if (max2 < arr[i] && arr[i] < max1){
                    max2 = arr[i];
                }
            }
            System.out.println("");
            System.out.println("Phần tử lớn thứ hai là: " + max2);
            System.out.println("Các chỉ số trong mảng của số lớn thứ hai là: ");
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == max2){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
