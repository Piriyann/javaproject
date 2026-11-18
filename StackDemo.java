import java.io.*;
import java.util.*;

class StackDemo {

    public static void main(String[] args) {

        Stack stack1 = new Stack();

        Stack<String> stack2 = new Stack<String>();

        stack1.push("5");
        stack1.push("All");
        stack1.push("are");

        stack2.push("welcomed");
        stack2.push("for");
        stack2.push("The class");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}