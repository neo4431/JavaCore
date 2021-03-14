import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> listBook = new ArrayList<Sach>();
        File folder = new File("E:/Lập Trình/git3/JavaCore/ArrayList/JavaArrayList2/Book");
        folder.mkdir();
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
            File file = new File("E:\\Lập Trình\\git3\\JavaCore\\ArrayList\\JavaArrayList2\\Book\\ListSachGiaoKhoa.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for (Sach book : listBook) {
                SachGiaoKhoa sachGiaokhoa = (SachGiaoKhoa) book;
                fileWriter.write(sachGiaokhoa.toString());
                fileWriter.append("\nVị trí: "+sachGiaokhoa.location());
                fileWriter.append("\nTồn kho: "+sachGiaokhoa.tonKho());
                fileWriter.append("\n=========================\n");
            }
            fileWriter.close();
            System.out.println("====Đọc fileReader====");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } else if (check == 2){
            for(int i = 0; i< n ; i++){
                Sach book = new DoAn();
                book.input();
                listBook.add(book);
            }
            File file = new File("E:\\Lập Trình\\git3\\JavaCore\\ArrayList\\JavaArrayList2\\Book\\ListDoAn.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for (Sach book : listBook) {
                DoAn doAn = (DoAn) book;
                fileWriter.write(doAn.toString());
                fileWriter.append("\nVị trí: " + doAn.location());
                fileWriter.append("\n=========================\n");
            }
            fileWriter.close();
            System.out.println("====Đọc fileReader====");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } else if (check == 3){
            for(int i = 0; i< n ; i++){
                Sach book = new TaiLieuDienTu();
                book.input();
                listBook.add(book);
            }
            File file = new File("E:\\Lập Trình\\git3\\JavaCore\\ArrayList\\JavaArrayList2\\Book\\ListEBook.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            for (Sach book : listBook) {
                TaiLieuDienTu eBook = (TaiLieuDienTu) book;
                fileWriter.write(eBook.toString());
                fileWriter.append("\nTổng tiền: " + eBook.totalPrice());
                fileWriter.append("\n=========================\n");
            }
            fileWriter.close();
            System.out.println("====Đọc fileReader====");
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } else {
            System.out.println("Hiện chưa có loại sách này!!!");
        }
        sc.close();
    }
}
