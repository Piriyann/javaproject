public class student{
    String name;
    int age;

    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student();

        s1.name = "alice";
        s1.age = 22;

        s2.name = "bob";
        s2.age = 23;

        System.out.println(s1.name + " is " + s1.age + " years old");
        System.out.println(s2.name + " is " + s2.age + " years old");
    }
}