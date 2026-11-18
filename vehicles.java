public class vehicles {
    String brand;
    int speed;

    void start() {
        System.out.println("vehicles is starting");
    }
    void stop() {
        System.out.println("vehicles is stopping")
    }
}

class car extends vehicles {
    int numberofDoors;

    void openTrunk() {
        System.out.println("car trunk is openning")
    }
}

public class main{
    public static void main(String[] args) {
        car car1 = new car();
        
        car1.brand = "Toyota";
        car1.speed = 120;
        car1.numberofDoors = 4;

        System.out.println("Brand: " + car1.brand);
        System.out.println("speed: " + car1.speed);
        System.out.println("numberofDoors: " + car1.numberpfDoors);

        car1.start();
        car1.openTrunk();
        car1.stop();
        }
}