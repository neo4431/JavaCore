import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> listBook = new ArrayList<Sach>();
        // ArrayList<Sach> schoolBook = new ArrayList<Sach>(); 
        // ArrayList<Sach> schoolBook = new ArrayList<Sach>();
        System.out.printf("Số lượng sách muốn nhập: ");
        int n = sc.nextInt();
        System.out.printf("Loại sách muốn nhập: \n - Sách giáo khoa bấm phím 1 \n - Đồ án bấm phím 2 \n - Tài liệu điện tự bấm phím 3 \n");
        int check = sc.nextInt();
        if(check == 1){
            for(int i = 0; i< n ; i++){
                Sach book = new SachGiaoKhoa();
                book.input();
                listBook.add(book);
            }
            System.out.println("-------Thông tin--------");
            for (Sach book : listBook) {
                SachGiaoKhoa sachGiaokhoa = (SachGiaoKhoa) book;
                System.out.println(sachGiaokhoa.toString());
                System.out.println("Vị trí: "+sachGiaokhoa.location());
                System.out.println("Tồn kho: "+sachGiaokhoa.tonKho());
                System.out.println("======================");
            }
        } else if (check == 2){
            for(int i = 0; i< n ; i++){
                Sach book = new DoAn();
                book.input();
                listBook.add(book);
            }
            System.out.println("-------Thông tin--------");
            for(Sach book : listBook){
                DoAn doAn = (DoAn) book;
                System.out.println(doAn.toString());
                System.out.println("Vị trí: " + doAn.location());
                System.out.println("======================");
            }
        } else if (check == 3){
            for(int i = 0; i< n ; i++){
                Sach book = new TaiLieuDienTu();
                book.input();
                listBook.add(book);
            }
            System.out.println("-------Thông tin--------");
            for(Sach book : listBook){
                TaiLieuDienTu eBook = (TaiLieuDienTu) book;
                System.out.println(eBook.toString());
                System.out.println("Tổng tiền: " + eBook.totalPrice());
                System.out.println("======================");
            }
        } else {
            System.out.println("Hiện chưa có loại sách này!!!");
        }
        File file = new File("");
    }
}
