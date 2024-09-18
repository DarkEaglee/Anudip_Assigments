public class Car {
    String brand;
    String model;
    float price;

    Car(){
        this.brand = "Not specified";
        this.model = "Not specified";
        this.price = 0;
    }

    Car(String brand, String model, int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void CarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price + "\n");
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car obj = new Car();
        Car obj1 = new Car("Maruti","Swift",600000);


        //Qustion 4 Part 2
        Book b1 = new Book(2000);
        Book b2 = new Book("The way");
        Book b3 = new Book("The way","Prince",5000);
    }
}
