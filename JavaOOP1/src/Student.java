public class Student {
    public int id;
    public String fullName;
    public float theoryPoint;
    public float practicePoint;
    // constructor mac dinh:
    public Student(){
    }
    // constructor co tham so:
    public Student(int id, String fullName, float theoryPoint, float practicePoint){
        this.id = id;
        this.fullName = fullName;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    // method tinh diem trung binh:
    public float averagePoint(){
        return (theoryPoint + practicePoint)/2;
    }
    public void display(){
        System.out.printf("%3d \t %s \t %10.2f \t %16.2f \t %16.2f \n",id,fullName,theoryPoint,practicePoint, averagePoint());
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Mã SV \t   Họ và tên \t Điểm lý thuyết \t Điểm thực hành \t Điểm trung bình");
        Student sv1 = new Student();
        sv1.id = 1;
        sv1.fullName = "Nguyen Van A";
        sv1.theoryPoint = 6.5f;
        sv1.practicePoint = 9.5f;
        Student sv2 = new Student();
        sv2.id = 2;
        sv2.fullName = "Nguyen Van B";
        sv2.theoryPoint = 7.5f;
        sv2.practicePoint = 9.3f;
        Student sv3 = new Student();
        sv3.id = 3;
        sv3.fullName = "Nguyen Van C";
        sv3.theoryPoint = 5.5f;
        sv3.practicePoint = 6.5f;
        Student sv4 = new Student(4, "Nguyen Van D", 9.1f, 9.2f);
        sv1.display();
        sv2.display();
        sv3.display();
        sv4.display();
    }
}