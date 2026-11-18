public class pulsar{
    String model;
    String name;
    String speed;
    int year;

    public void displaydetails(){
        System.out.println("model: " + model);
        System.out.println("name: " + name);
        System.out.println("speed: " + speed);
        System.out.println("year: " + year);
    }
    public static void main(String[] args){
        pulsar pulsar1 = new pulsar();

        pulsar1.model = "rs200";
        pulsar1.name = "bs6";
        pulsar1.speed = "200km";
        pulsar1.year = 2019;

        pulsar1.displaydetails();
    }
}