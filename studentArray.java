class student {
    int id;
    String name;
    double marks;

    student (int id,  String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void displaydetails() {
        System.out.println("id: " + id );
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("--------");
    }
}

public class studentArray {
    public static void main(String[] args) {
        student[] students = new student[3];

        students[0] = new student(1, "piriyan", 75.5);
        students[1] = new student(2, "piri", 82.0);
        students[2] = new student(3, "yaan", 68.5);

        for (int i = 0; i < students.length; i++) {
            students[i].displaydetails();
        }

    }
    
}
