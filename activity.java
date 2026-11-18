public class activity{
    public static void main (String[] args) {
        int num1= 20;
        int num2= 5;
        char operator = '+';

        double result;

        switch (operator) {
        
        case '+':
            result = num1 + num2;
            System.out.println("result =" + (num1 + num2));
            break;
        
        case '-':
            result = num1 - num2;
            System.out.println("result =" + (num1 - num2));
            break;
        
        case '*':
            result = num1 * num2;
            System.out.println("result =" + (num1 * num2));
            break;
        
        case '/':
            result = num1 / num2;
            System.out.println("result =" + (num1 / num2));
            break;

        default:
            System.out.println("invalid syntax");

        }
    }
}