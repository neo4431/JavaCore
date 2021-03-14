import java.util.Scanner;
public class TaiLieuDienTu extends Sach implements IDownload{
    private double capacity;
    private Long downloads;
    private Long price;
    
    public TaiLieuDienTu(int id, String name, String publisher, int publishYear) {
        super(id, name, publisher, publishYear);
    }
    
    public TaiLieuDienTu() {
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập dung lượng: ");
        capacity = sc.nextDouble();
        System.out.printf("Nhập số lượt tải: ");
        downloads = sc.nextLong();
        System.out.printf("Nhập giá thành: ");
        price = sc.nextLong();
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nDung lượng: "+capacity+"\nLượt tải: "+downloads+"\nGía thành: "+price;
    }
    
    @Override
    public Long totalPrice() {
        // TODO Auto-generated method stub
        return downloads * price;
    }

    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public Long getDownloads() {
        return downloads;
    }
    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }

    
}
