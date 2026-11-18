public class employee{
    int id;
    String name;
    double salary;

employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void displayDetails(){
    System.out.println("Employee id:  " + id);
    System.out.println("Employee name: " + name);
    System.out.println("Employee salary: " + salary);
    System.out.println();

  }
  public static void main(String[] args) {
      employee e1 = new employee(01,"kamal",2300.00);
      employee e2 = new employee(02,"nimal",2200.00);

      e1.displayDetails();
      e2.displayDetails();
  }
}

