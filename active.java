class  calculator {
    int addNumbers(int Number1, int Number2) {
        int total = Number1 + Number2;
        return total;
    }
}

public class active {
    public static void main(String[] args) {
        calculator c1 = new calculator();

        int answer = c1.addNumbers(10, 20);

        System.out.println("Answer: " + answer);

        
    }
}