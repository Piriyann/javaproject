public class lap{
    String name;
    String model;
    int year;
    String core;
    int ram;

    public void displaydetails(){
        System.out.println("name: " + name );
        System.out.println("Model: "  + model);
        System.out.println("Year:  " + year);
        System.out.println("Core: " + core);
        System.out.println("Ram: " + ram);
    }
    public static void main(String[]  args) {
        lap lap1 = new lap();

        lap1.name = "Asus";
        lap1.model = "vivobook";
        lap1.year = 2024;
        lap1.core = "i3";
        lap1.ram = 528;

        lap1.displaydetails();


    }
}
