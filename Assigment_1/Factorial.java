import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        factorialNumber(number);
    }

    static void factorialNumber(int num){
        int factorial=1;
        while(num!=1){
            factorial *= num;
            num--;
        }
        System.out.println("Factorial of "+num+" is: "+factorial);
    }
}
