public class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }
}

class PersonMain{
    public static void main(String[] args) {
        Person p = new Person();
        p.setAddress("Delhi");
        p.setAge(18);
        p.setName("Prince");

        System.out.println("Age: "+p.getAge());
        System.out.println("Address: "+p.getAddress());
        System.out.println("Name: "+p.getName());

    }
}
