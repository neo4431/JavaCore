import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Teacher> listTeacher = new ArrayList<Teacher>();
        List<Student> listStudent = new ArrayList<Student>();

        listTeacher.add(new Teacher(1, "Ngoc", 26, "HG", 5000000L));
        listTeacher.add(new Teacher(2, "Cuong", 26, "HN", 16000000L));
        listTeacher.add(new Teacher(3, "Hien", 26, "QN", 1455000L));
        listTeacher.add(new Teacher(4, "Ba", 26, "DN", 1400000L));
        listTeacher.add(new Teacher(5, "Duy", 26, "LG", 2000000L));
        listStudent.add(new Student(1, "Manh", 26, "HN", 7.5));
        listStudent.add(new Student(2, "Hieu", 26, "LB", 5.9));
        listStudent.add(new Student(3, "Hai", 26, "HL", 9.1));
        listStudent.add(new Student(4, "Duong", 26, "GL", 8.2));
        listStudent.add(new Student(5, "Pho", 26, "ND", 7.8));
        
        // Sắp xếp giáo viên theo tên
        Collections.sort(listTeacher, new Comparator<Teacher>(){
            public int compare(Teacher o1, Teacher o2) {
                return o1.getName().compareTo(o2.getName());
            };
        });
        System.out.println("Thông tin giáo viên sắp xếp theo tên: ");
        printArray(listTeacher);
        // Sắp xếp giáo viên theo lương
        Collections.sort(listTeacher, new Comparator<Teacher>(){
            public int compare(Teacher o1, Teacher o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            };
        });
        System.out.println("Thông tin giáo viên sắp xếp theo lương: ");
        printArray(listTeacher);
        // Sắp xếp học viên theo tên
        Collections.sort(listStudent, new Comparator<Student>(){
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Thông tin học viên sắp xếp theo tên: ");
        printArray(listStudent);
        // Sắp xếp học viên theo gpa
        Collections.sort(listStudent, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                // TODO Auto-generated method stub
                return o1.getGpa() > o2.getGpa() ? 1 : -1;
            }
        });
        System.out.println("Thông tin học viên sắp xếp theo gpa: ");
        printArray(listStudent);
    }

    public static void printArray(List<? extends Person> lists){
        System.out.println(lists.toString());
    }
}
