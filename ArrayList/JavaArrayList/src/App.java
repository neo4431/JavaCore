import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Staff> listStaff = new ArrayList<Staff>();
        System.out.print("Số lượng nhân viên muốn nhập: ");
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            Staff staff = new Staff();
            staff.input();
            listStaff.add(staff);
        }
        System.out.println("---------In thông tin--------");
        for (Staff staff : listStaff) {
            System.out.println(staff.toString());
            System.out.println("=========================");
        }
        // Chèn nhân viên vào vị trí position:
        System.out.println("Nhập vị trí muốn thêm: ");
        int position = sc.nextInt();
        Staff staff = new Staff();
        staff.input();
        listStaff.add(position,staff);
        System.out.println("---------In thông tin--------");
        for (Staff ele : listStaff) {
            System.out.println(ele.toString());
            System.out.println("=========================");
        }
        // Xóa thông tin nhân viên theo name và id
        System.out.print("Nhập mã nhân viên muốn xóa: ");
        int idDelete = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên nhân viên muốn xóa: ");
        String nameDelete = sc.nextLine();
        for(int i = 0; i<listStaff.size(); i++){
            if(listStaff.get(i).getId() == idDelete && listStaff.get(i).getName().equals(nameDelete)){
                listStaff.remove(i);
            }
        }
        for (Staff ele : listStaff) {
            System.out.println(ele.toString());
            System.out.println("=========================");
        }
        // sửa tên nhân viên
        System.out.print("Nhập mã nhân viên muốn sửa: ");
        int idChange = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên nhân viên muốn sửa: ");
        String nameChange = sc.nextLine();
        System.out.print("Nhập tên nhân viên mới: ");
        String newName = sc.nextLine();
        for(int i = 0; i<listStaff.size(); i++){
            if(listStaff.get(i).getId() == idChange && listStaff.get(i).getName().equals(nameChange)){
                listStaff.get(i).setName(newName);
            }
        }
        for (Staff ele : listStaff) {
            System.out.println(ele.toString());
            System.out.println("=========================");
        }
        // Tạo file txt và lưu thông tin
        File myDir = new File("E:/Lập Trình/JavaCore/BTVN/JavaArrayList/StaffInfo");
        myDir.mkdir();
        File myFile = new File("E:\\Lập Trình\\JavaCore\\BTVN\\JavaArrayList\\StaffInfo\\NhanVien.txt");
        myFile.createNewFile();
        FileWriter fileWriter = new FileWriter(myFile);
        for (Staff ele : listStaff) {
            fileWriter.write(ele.toString());
            fileWriter.append("\n==================\n");
        }        
        fileWriter.close();
        sc.close();
    }
}
