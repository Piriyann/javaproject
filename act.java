class student {
    void displaydetails(String name, int age, String course) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("course: " + course);    
    }
}

public class act {
    public static void main(String[] args) {
        student s1 = new student();

        s1.displaydetails("saman",21,"computer science");

       
} 
    }