class Employee {
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void EmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
}

class Manager extends Employee {
    int bonus;

    Manager(String name, int id, int salary,int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void ManagerInfo() {
        EmployeeInfo();
        System.out.println("Manager Bonus: $" + bonus + "\n");
    }
}

public class InheritEmployee{
    public static void main(String[] args) {
        Employee emp1= new Employee("Jatin", 21, 50000);
        System.out.println("\nEmployee:");
        emp1.EmployeeInfo();

        Manager manager1 = new Manager("Prince", 23, 234324, 2000);
        System.out.println("\nManager :");
        manager1.ManagerInfo();
    }
}