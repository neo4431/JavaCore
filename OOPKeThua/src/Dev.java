public class Dev extends Staff {
    private int overTime;

    public Dev() {
    }

    public Dev(int id, String name, int age, String phone, String email, long basicSalary, int overTime) {
        super(id, name, age, phone, email, basicSalary);
        this.overTime = overTime;
    }

    public long totalSalary() {
        return getBasicSalary() + (overTime * 200000);
    }

    public int getOverTime() {
        return overTime;
    }
    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public void display() {  
        super.display();
        System.out.println("Số giờ tăng ca: " + overTime);
        System.out.println("Tổng lương: " + totalSalary());
    }
}
