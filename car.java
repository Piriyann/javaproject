public class car{
    //propeties
    String name;
    String color;

    //displaying details

    public void displaydetails(){
        System.out.println("Name:"+name );
        System.out.println("Color: "+color);

    }
    
    //object
    public static void main(String[] args){
        car car1 = new car();

        car1.name="vezal";
        car1.color="white";

        car1.displaydetails();
    }
}