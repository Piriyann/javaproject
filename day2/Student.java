public class Student{
    String name;
    String city;
    int age;
    String specialNeed;
    
    Student(
        String name,
        int age,
        String city
    ){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    void displaydetails(){
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("city:" + this.city);
    
    }

    
    public static void main(String[] args){
        Student student = new Student("piri", 22, "colombo");

        student.displaydetails();
    }

}
