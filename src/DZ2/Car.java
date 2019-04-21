package DZ2;

public class Car {
    String Mark;

    byte age = 5;

    int WeightInKg = 2400;

    long carRacing = 0;

    long maxSpeed = 300;

    boolean isWorking; //false

    public Car () {
        isWorking = true;
        System.out.println("Pleas Drive");
    }
    public Car (String Mark) {
        this ();
        this.Mark = Mark;
        System.out.println("Pleas Drive(String Mark");
    }
    public void CarRacing (){

        carRacing = maxSpeed +5;
    }








}
