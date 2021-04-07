public class Car {
    // Color, type, speed

    private String color;
    private String type;
    private int speed;
    private int gear;

    // No arguments constructor
    public Car(){
        this.color = "Khaki";
        this.type = "Land Rover";
      //  this.speed = 0;
    }
    // arguments constructor
    public Car(String color, String type) {
        this.color = color;
        this.type = type;
    }
    // another argument constructor
    public Car(String color, String type, int speed) {
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    public void paintTheCar(String newColor){
        this.color = newColor;
    }

    public void accelerate(int newSpeed){
        this.speed = newSpeed;
        if (speed > 10){
            this.changeGear(2);
        }
    }

    public String getTheType(){
        return this.type;
    }

    public int printSpeed(){
        return this.speed;
    }

    public void printCarProperties(){
        System.out.println("This car type is: "+ this.type + "\n" +
                "its color is: " + this.color + "\n" +
                "its speed is: " + this.speed + "\n"+
                "its gear is: " + this.gear);
    }

    private void changeGear(int newGear){
        this.gear = newGear;
    }

}
