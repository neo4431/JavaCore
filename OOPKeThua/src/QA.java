public class QA extends Staff{
    private int errorFound;
    public QA() {
    }

    public QA(int id, String name, int age, String phone, String email, long basicSalary, int errorFound) {
        super(id, name, age, phone, email, basicSalary);
        this.errorFound = errorFound;
    }

    public long totalSalary(){
        return getBasicSalary() + errorFound * 50000;
    }
    public void display(){
        super.display();
        System.out.println("Số lỗi tìm được: " + errorFound);
        System.out.println("Tổng lương: " + totalSalary());
    }
    public int getErrorFound() {
        return errorFound;
    }
    public void setErrorFound(int errorFound) {
        this.errorFound = errorFound;
    }   
}
