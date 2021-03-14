import java.util.Scanner;

public class Sach {
    private int id;
    private String name;
    private String publisher;
    private int publishYear;
    private int amount;

    public Sach(int id, String name, String publisher, int publishYear, int amount) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishYear = publishYear;
        this.amount = amount;
    }

    public Sach() {
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập mã sách: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập tên sách: ");
        name = sc.nextLine();
        System.out.printf("Nhập nhà xuất bản: ");
        publisher = sc.nextLine();
        System.out.printf("Nhập năm xuất bản: ");
        publishYear = Integer.valueOf(sc.nextLine());
        System.out.printf("Nhập số lượng: ");
        amount = Integer.valueOf(sc.nextLine());
    }

    public String toString(){
        return "Mã sách: "+id+"\nTên sách: "+name
        +"\nNhà xuất bản: "+publisher+"\nNăm xuất bản: "+publishYear+"\nSố lượng: "+amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
