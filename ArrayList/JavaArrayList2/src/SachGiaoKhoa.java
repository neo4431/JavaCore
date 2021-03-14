import java.util.Scanner;

public class SachGiaoKhoa extends Sach implements IKho, IMuon{
    private int amountPage;
    private String status;
    private int amountBorrow;
    private int total;
    
    public SachGiaoKhoa(int id, String name, String publisher, int publishYear, int amount, int amountPage,
            String status, int amountBorrow, int total) {
        super(id, name, publisher, publishYear, amount);
        this.amountPage = amountPage;
        this.status = status;
        this.amountBorrow = amountBorrow;
        this.total = total;
    }

    public SachGiaoKhoa(){
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số trang sách giáo khoa: ");
        amountPage = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập tình trạng sách giáo khoa: ");
        status = sc.nextLine();
        System.out.printf("Nhập tổng số lượng sách giáo khoa: ");
        total = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập số lượng mượn: ");
        amountBorrow= Integer.valueOf(sc.nextLine());
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nSố trang sách: "+amountPage
        +"\nTình trang sách: "+status+"\nTổng số lượng: "+total+"\nSố lượng mượn: "+amountBorrow;
    }
    
    @Override
    public String location() {
        // TODO Auto-generated method stub
        return "Vị trí sách giáo khoa";
    }

    @Override
    public int tonKho() {
        // TODO Auto-generated method stub
        return getTotal() - amountBorrow;
    }

    public int getAmountPage() {
        return amountPage;
    }
    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getAmountBorrow() {
        return amountBorrow;
    }
    public void setAmountBorrow(int amountBorrow) {
        this.amountBorrow = amountBorrow;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
