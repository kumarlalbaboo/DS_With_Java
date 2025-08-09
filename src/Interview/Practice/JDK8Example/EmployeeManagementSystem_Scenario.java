package Interview.Practice.JDK8Example;


import java.util.List;

class EmployeeRecord {

    private String name;
    private int age;
    private double salary;

    public EmployeeRecord(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

}

public class EmployeeManagementSystem_Scenario {
    public static void main(String[] args) {
        List<EmployeeRecord> employeeList = List.of(new EmployeeRecord("John", 30, 10000.00),
                new EmployeeRecord("Mary", 25, 15000.00),
                new EmployeeRecord("Mike", 35, 20000.00));

        //
        double d = employeeList.stream().filter(e->e.getAge() > 25)
                .mapToDouble(e->e.getSalary())
                .average().orElse(0.0);

        System.out.println("Find avg salary of employee who's age is greater than 25: "+d+" ");

    }
}
