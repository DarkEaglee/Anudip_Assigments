import java.util.Scanner;
public class SumofNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        sumNumber(number);
    }

    static void sumNumber(int num){
        int sum=0;
        while(num!=0){
            sum += num;
            num--;
        }
        System.out.println("Sum of "+num+" Natural numbers: "+sum);
    }
}
