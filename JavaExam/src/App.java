import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 01: luyện nhập số từ màn hình và ArrayList
        // Hãy viết một ứng dụng dạng Console nhập từ bàn phím cho đến khi người dùng gõ
        // ký tự 'Q' hoặc 'q'
        // Nếu chuỗi ký tự nhập vào có thể chuyển thành số tự nhiên, thì hãy sắp xếp
        // theo thứ tự tăng dần. Ví dụ nhập vào:
        // 3 1 5 7 8 2 q
        // Mảng ngay sau khi nhập sẽ là 1, 2, 3, 5, 7, 8
        System.out.println("Bài 1: luyện nhập số từ màn hình và ArrayList");
        List<Integer> list = new ArrayList<Integer>();
        input(list);
        display(list);

        // 02: Tìm tổng hai số trong một mảng có giá trị gần nhất một số đã cho
        // Nhập vào một số N nguyên dương > 8 và < 14
        // Sinh ra một mảng gồm N phần tử là các số tự nhiên ngẫu nhiên có giá trị từ
        // -10 đến 10
        // In các phần tử mảng ra màn hình
        // Nhập vào một số X trong khoảng từ -10 đến 10
        // Hãy liệt kê tất cả các cặp 2 số trong mảng có tổng gần với số X nhất.
        System.out.println("Bài 2: Tìm tổng hai số trong một mảng có giá trị gần nhất một số đã cho");
        ArrProject mang = new ArrProject();
        int[] arr = mang.input();
        mang.xuatMang(arr);
        mang.timCapSo(arr);
    }

    public static List<Integer> input(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        Boolean isStop = false;
        System.out.println("Nhập số tự nhiên vào mảng: ");
        while (isStop == false) {
            try {
                String str = sc.nextLine();
                if (str.toLowerCase().equals("q") == false) {
                    int num = Integer.parseInt(str);
                    if (num >= 0) {
                        list.add(num);
                    } else {
                        System.out.println("Số tự nhiên là số >= 0");
                    }
                } else {
                    Collections.sort(list);
                    isStop = true;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Không chuyển được thành số tự nhiên");
            }
        }
        return list;
    }

    public static void display(List<Integer> list) {
        System.out.println("In mảng: ");
        System.out.println(list);
    }

}
