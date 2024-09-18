import java.util.Scanner;
public class fibonaciseeris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int number = scanner.nextInt();
        System.out.println("Fibbonacie Series : ");
        fibSeries(number);
    }

    static void fibSeries(int num) {
        int a=0,b=1,c=0;
        if(num==1){
            System.out.println(a);
        }
        else if(num==2){
            System.out.print(a+" ");
            System.out.print(b+" ");
        }
        else{
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=2;i<num;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
        }
        }
    }
}
