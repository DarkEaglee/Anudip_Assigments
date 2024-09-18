public class Pattern {
    public static void main(String[] args) {

        System.out.println("Pattern 1");
        int number = 4;
        int i,j;
        for (i = 1; i <= number; i++) {
            for (j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Pattern 2");


        for ( i = 1; i <= 3; i++) {
            for (j = i; j < 3; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println(" ");
        System.out.println("Pattern 3");


        for (i = 3; i >= 1; i--) {
            for (j = 0; j < 3 - i; j++) {
                System.out.print(" ");
            }

            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
