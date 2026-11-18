public class phone{
    String name;
    String model;
    int year;
    int ram;

    public void displaydetails(){
        System.out.println("Name:  "+ name);
        System.out.println("Model:"+ model);
        System.out.println("Year:"+ year);
        System.out.println("Ram:"+ ram);

    }
    public static void main(String[] args) {
        phone phone1 = new phone();
        phone phone2 = new phone();

        phone2.name="samsung";6
        phone2.model="A04s";
        phone2.year=2021;
        phone2.ram=5;

        phone1.name="iphone";
        phone1.model="i17";
        phone1.year=2020;
        phone1.ram=4;

        phone1.displaydetails();
        phone2.displaydetails();


    }
}
