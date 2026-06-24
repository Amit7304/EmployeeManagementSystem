import model.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(
                101,
                "Amit",
                "IT",
                50000

        );
       System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        emp.setSalary(70000);
        System.out.println(emp.getSalary());
        System.out.println(emp);
    }
}