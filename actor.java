public class actor {
    String name;
    String job;
    String location;
    int age;
    
    public void displaydetails() {
        System.out.println("Name:" + name);
        System.out.println("Job: " + job);
        System.out.println("Location: " + location);
        System.out.println("Age: " + age);

    }
    public static void main(String[] args){

        actor actor1 = new actor();
        actor1.name = ("VIJAY");
        actor1.job = ("Ministor");
        actor1.location = ("chennai");
        actor1.age = (46);

        actor1.displaydetails();


    }
}
