public class cars {
    String brand;
    String model;
    double price;

    public static void main(String[] args){
        cars car1 = new cars();
        cars car2 = new cars();

        car1.brand = "honda";
        car1.model = "rs";
        car1.price = 4567833.99;

        car2.brand ="toyota";
        car2.model = "asyw";
        car2.price = 233.44;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.price);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.price);

        
    }

}