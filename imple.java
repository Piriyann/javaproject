import java.io.*;
import java.util.*;

class Test
{
    static void stack_push(stack<integer> stack)

    {
        for(int i = 0;  i<5; i++)
        {
            stack.push(i);
        }
    }

    static void stack_pop(stack<integer>stack)
    {
        system.out.println("pop operation.");

        for(int i = 0; i<5;i++)
        {
            integer y = (integer) stack.pop();
            system.out.println(y);
        }
    }
    static void stack_peek(stack<integer>stack)
    {
        integer element = (integer) stack.peek();
        system.out.println("Element on stack top:" + element);
    }
    

}


