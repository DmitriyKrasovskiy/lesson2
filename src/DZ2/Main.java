package DZ2;

public class Main {
    public static void main (String [] args) {
        Car Mark = new Car ( "Mercedes");

        System.out.println("isWorking=" + Mark.isWorking);

        System.out.println("CarMark=" + Mark.Mark);


        System.out.println("maxSpeed=" + Mark.maxSpeed);
             Mark.CarRacing ();
        System.out.println("CarRacing=" + Mark.carRacing);


    }
}
