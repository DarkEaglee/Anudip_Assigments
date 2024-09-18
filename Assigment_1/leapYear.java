public class leapYear {
    public static void main(String[] args) {
        int year=2015;
        LeapYear(year);
    }

    static void LeapYear(int y){
        if((y % 400 == 0) || (y % 100 != 0) &&  (y % 4 == 0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
