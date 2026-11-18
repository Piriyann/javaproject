public class bus{
    String name;
    String company;
    int year;

    public void displaydetails(){
        System.out.println("Name:"+ name);
        System.out.println("company:"+ company);
        System.out.println("year:"+ year);
    }

    public static void main(String[] args){
        bus bus1 = new bus();

        bus1.name = "rathna";
        bus1.company = "lanka ashok leyland";
        bus1.year = 2025;

        bus1.displaydetails();
    }
}
