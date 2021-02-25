public class Student {
    int id;
    String fullName;
    float theoryPoint;
    float practicePoint;
    // constructor mac dinh:
    public Student(){
        System.out.println("Constructor mac dinh");
    }
    // constructor co tham so:
    public Student(int id, String fullName, float theoryPoint, float practicePoint){
        this.id = id;
        this.fullName = fullName;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    // method tinh diem trung binh:
    public void averagePoint(){
        System.out.println("Diem trung binh: " + (theoryPoint + practicePoint)/2);
    }
}