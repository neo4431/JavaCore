import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = 50;
        Sach[] arrBook = new Sach[size];
        System.out.printf("Số lượng sách muốn nhập: ");
        int n = sc.nextInt();
        System.out.printf("Loại sách muốn nhập: \n - Sách giáo khoa bấm phím 1 \n - Đồ án bấm phím 2 \n - Tài liệu điện tự bấm phím 3 \n");
        int check = sc.nextInt();
        if(check == 1){
            for(int i = 0; i< n ; i++){
                arrBook[i] = new SachGiaoKhoa();
                arrBook[i].input();
            }
            for(int i = 0; i< n ; i++){
                SachGiaoKhoa sachGiaoKhoa = (SachGiaoKhoa) arrBook[i];
                System.out.println("---------Thông tin---------");
                System.out.println(sachGiaoKhoa.toString());
                System.out.println("Vị trí: " + sachGiaoKhoa.location());
                System.out.println("Tồn kho: " + sachGiaoKhoa.tonKho());
            }
        } else if (check == 2){
            for(int i = 0; i< n ; i++){
                arrBook[i] = new DoAn();
                arrBook[i].input();
            }
            for(int i = 0; i< n ; i++){
                DoAn doAn = (DoAn) arrBook[i];
                System.out.println("---------Thông tin---------");
                System.out.println(doAn.toString());
                System.out.println("Vị trí: " + doAn.location());
            }
        } else if (check == 3){
            for(int i = 0; i< n ; i++){
                arrBook[i] = new TaiLieuDienTu();
                arrBook[i].input();
            }
            for(int i = 0; i< n ; i++){
                TaiLieuDienTu taiLieu = (TaiLieuDienTu) arrBook[i];
                System.out.println("---------Thông tin---------");
                System.out.println(taiLieu.toString());
                System.out.println("Tổng tiền = " + taiLieu.totalPrice());
            }
        } else {
            System.out.println("Hiện chưa có loại sách này!!!");
        }
    }
}
