public class vehicle{
    String Name;
    String model;
    int year;

    public void displaydetails(){
        System.out.println("Name: "+ Name );
        System.out.println("model: "+ model);
        System.out.println("year: "+ year);
        
    }
    public static void main(String[] args){
        vehicle vehicle1 = new vehicle();

        vehicle1.Name = "mddie";
        vehicle1.model = "edfjfwjfj";
        vehicle1.year = 2034;

        vehicle1.displaydetails();
    }
}
