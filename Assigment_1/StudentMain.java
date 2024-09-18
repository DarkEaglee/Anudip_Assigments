class Student {
    String name;
    int age;
    char grade;
    Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade); }
}

public class StudentMain{
    public static void main(String[] args) {
        Student obj1 = new Student("Prince", 19, 'A');
        Student obj2 = new Student("Jatin", 20, 'B');
        Student obj3 = new Student("Raj", 18, 'C');
        Student obj4 = new Student("Michael", 21, 'D');

        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();
        obj4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println();
    }
}

