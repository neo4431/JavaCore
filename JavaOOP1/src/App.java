public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student(1, "Nguyen Van A", 7.5f, 9.0f);
        Student student2 = new Student(2, "Nguyen Van B", 9.5f, 9.5f);
        Student student3 = new Student(3, "Nguyen Van C", 5.5f, 6.5f);
        Student student4 = new Student();
        student4.id = 4;
        student4.fullName = "Nguyen Van D";
        student4.theoryPoint = 9.1f;
        student4.practicePoint = 9.2f;
        student1.averagePoint();
        student2.averagePoint();
        student3.averagePoint();
        student4.averagePoint();
    }
}
