
public class evenOdd {
    public static void main(String[] args) {
        check(50);      // Functiono call
    }

    //    Function to check even and odd number
    static void check(int number){
        if(number%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}