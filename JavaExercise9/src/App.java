import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> listEmp = new ArrayList<Employee>();
        listEmp.add(new Waiter(1,"Waiter1",29,300000L,150000L));
        listEmp.add(new Waiter(2,"Waiter2",30,400000L,100000L));
        listEmp.add(new Waiter(3,"Waiter3",31,500000L,250000L));
        listEmp.add(new Kitchen(1,"Kitchen1",31,200000L,250000L));
        listEmp.add(new Kitchen(2,"Kitchen2",32,250000L,150000L));
        listEmp.add(new Kitchen(3,"Kitchen3",33,350000L,350000L));
        printArray(listEmp);
    }
    public static void printArray(List <? extends Employee> list){
        for (Employee emp : list) {
            System.out.println("");
            System.out.println(emp.toString());
            System.out.println("Total Salary: "+emp.calculatorSalary());
        }
        
    }
}
