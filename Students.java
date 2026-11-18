public class Students{
    String studentName;
    int studentId;
    double marks;

    static void displayStudenstInfo() {

        Students s1 = new Students();

        s1.studentName = "piri";
        s1.studentId = 888;
        s1.marks = 68.89;

        System.out.println(s1.studentName);
        System.out.println(s1.studentId);
        System.out.println(s1.marks);
    }
        public static void main(String[] args){
            displayStudenstInfo();
          }


    }
