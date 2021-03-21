public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private Long basicSalary;
    
    public Employee(int id,String name,int age, Long basicSalary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    };
    public Employee(){};
    public abstract Long calculatorSalary();
    public String toString(){
        return "ID: "+id+"\nName: "+name+"\nAge: "+age+"\nBasic Salary: "+basicSalary;
    };
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(Long basicSalary) {
        this.basicSalary = basicSalary;
    }
    
}
  