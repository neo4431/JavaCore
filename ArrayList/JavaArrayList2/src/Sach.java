import java.util.Scanner;

public class Sach {
    private int id;
    private String name;
    private String publisher;
    private int publishYear;

    public Sach(int id, String name, String publisher, int publishYear) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.publishYear = publishYear;
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
    }

    public String toString(){
        return "Mã sách: "+id+"\nTên sách: "+name
        +"\nNhà xuất bản: "+publisher+"\nNăm xuất bản: "+publishYear;
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
}
