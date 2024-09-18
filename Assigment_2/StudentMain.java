class Student {
    private String name;
    private int marks;
    private char grade;

    public String getName() {
        return name;
    }

    public int getScore() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Name is empty");
        }
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void StudentInfo(){
        setGrade();
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }

    public void setGrade() {
        if (marks >= 90) {
            this.grade = 'A';
        } else if (marks >= 80) {
            this.grade = 'B';
        } else if (marks >= 70) {
            this.grade = 'C';
        } else if (marks >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Prince");
        s1.setMarks(50);
        s2.setName("Jatin");
        s2.setMarks(90);
        s1.StudentInfo();
        s2.StudentInfo();
    }
}
