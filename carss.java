public class carss {
    String model;
    String name;
    int year;

    public static void main(String[] args) {

        carss car1 = new carss();

        car1.model = "honda";
        car1.name = "vezal";
        car1.year = 2013;

        System.out.println(car1.model);
        System.out.println(car1.name);
        System.out.println(car1.year);
    }
}

