public class cat {
    String Name;
    String speed;
    String place;
    String leg;

    public void displaydetails() {
        System.out.println( "Name: " + Name );
        System.out.println( "Speed: " + speed );
        System.out.println( "Place: " + place );
        System.out.println( "leg: " + leg );

    }
    public static void main(String[] args) {
        cat cat1 = new cat();

        cat1.Name = "leo";
        cat1.speed = ("100km/h");
        cat1.place = ("home");
        cat1.leg = ("4");

        cat1.displaydetails();

    }

}
