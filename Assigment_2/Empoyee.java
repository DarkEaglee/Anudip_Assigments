class Employee{
   String Role;
    public void getRole(){
        Role = "Employee" ;
        System.out.println(Role);
    }
}
class Manager extends Employee{
    public void getRole(){
        Role = "Manager" ;
        System.out.println(Role);
    }
}
class Developer extends Employee{
    public void getRole(){
        Role = "Developer" ;
        System.out.println(Role);
    }
}

public class Empoyee {
    public static void main(String[] args) {
        System.out.println("Dynamic method Dispatch for manager object by reference Employee");
        Employee m = new Manager();
        m.getRole();

        System.out.println("\nDynamic method Dispatch for Developer object by reference Employee");
        Employee d = new Developer();
        d.getRole();
    }
}
