import java.util.Scanner;
public class DoAn extends Sach implements IKho{
    private int amountPage;
    private String status;
    private int yearOfProtection;
    
    public DoAn(int id, String name, String publisher, int publishYear, int amount, int amountPage, String status,
            int yearOfProtection) {
        super(id, name, publisher, publishYear, amount);
        this.amountPage = amountPage;
        this.status = status;
        this.yearOfProtection = yearOfProtection;
    }
    
    public DoAn() {
    }
    
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập số trang đồ án: ");
        amountPage = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập tình trạng đồ án: ");
        status = sc.nextLine();
        System.out.printf("Nhập năm bảo vệ đồ án: ");
        yearOfProtection = Integer.valueOf(sc.nextLine());
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nSố trang đồ án: "+amountPage+"\nTình trạng đồ án: "+status+"\nNăm bảo vệ: "+yearOfProtection;
    }

    @Override
    public String location() {
        // TODO Auto-generated method stub
        return "Vị trí đồ án";
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

    public int getYearOfProtection() {
        return yearOfProtection;
    }

    public void setYearOfProtection(int yearOfProtection) {
        this.yearOfProtection = yearOfProtection;
    }

    
}
