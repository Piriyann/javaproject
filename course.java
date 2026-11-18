public class course{
    String name;
    String code;
    int number;

    public void displaydetails(){
        System.out.println("Name:"+  name);
        System.out.println("code:"+code);
        System.out.println("number:"+ number);

    
    }

    public static void main(String[] args){
        course course1 = new course();

        course1.name =  "datascience";
        course1.code = "cds";
        course1.number =  23;

        course1.displaydetails();

    }
}