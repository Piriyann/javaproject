public class bike {

        String name;
        String model;
        int speed;
        int year;
     public void displaydetails(){
        System.out.println("Name:"+ name);
        System.out.println("model:"+ model);
        System.out.println("speed:"+ speed);
        System.out.println("year:"+ year);
    }

    public static void main(String[] args){

        bike bike1 = new bike();

        bike1.name  = "rs";
        bike1.model = "bs6";
        bike1.speed = 200;
        bike1.year = 2017;

    bike1.displaydetails();
    }
}
