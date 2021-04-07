public class CarApplication {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCarInDetails = new Car("blue", "Land rover", 0);

        myCarInDetails.paintTheCar("red");
        myCarInDetails.printCarProperties();
        myCar.printCarProperties();

        myCarInDetails.accelerate(100);
        myCarInDetails.printCarProperties();

        Car tosinsCar = new Car("black", "Mercedes");
        tosinsCar.printCarProperties();
    }
}
