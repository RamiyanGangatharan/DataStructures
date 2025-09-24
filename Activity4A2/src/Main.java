import java.util.Stack;
public class Main {
    public static void main (String[] args)
    {
        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        intStack.push(2001);
        intStack.push(2002);
        intStack.push(2003);
        intStack.push(2004);
        intStack.push(2005);

        strStack.push("lamb");
        strStack.push("little");
        strStack.push("a");
        strStack.push("had");
        strStack.push("Mary");

        for (int i = 0; i < strStack.capacity(); i++)
        {
            if (!strStack.isEmpty())
            {
                System.out.print(strStack.peek() + " ");
                strStack.pop();
            }
        }

        System.out.println();
        System.out.print("Years in my stack: ");
        for (int j = 0; j < intStack.capacity(); j++)
        {
            if (!intStack.isEmpty()) {
                System.out.print(intStack.peek() + " ");
                intStack.pop();
                if (intStack.size() < 1) { System.out.print("[END OF STACK]: ");}
                if (intStack.isEmpty()) {System.out.println("Stack is now Empty...");}
            }
        }
    }
}