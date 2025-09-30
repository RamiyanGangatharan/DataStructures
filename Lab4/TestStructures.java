public class TestStructures {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        // Loop to add items to my stack
        for (int i = 0; i < 12; i++) { stack.push(i); }

        System.out.println("Stack popping operations");
        System.out.println("------------------------");
        while (!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }

        System.out.println("\nreloading stack....");

        for (int i = 0; i < 3; i++) { stack.push(i); }

        System.out.println("Top of the current stack: " + stack.peek() + "\n");

        System.out.println("Transferring stack to queue");
        System.out.println("---------------------------");
        while (!stack.isEmpty())
        {
            int value = (int)stack.pop();
            queue.enqueue(value);
            System.out.println(value);
        }

        System.out.println("De-queue'ing the queue");
        System.out.println("---------------------");

        System.out.println(queue.front());
        while (!queue.isEmpty())
        {
            queue.dequeue();
            System.out.println(queue.front());
        }

        System.out.println("\nWhat happens when you pop an empty stack: " + stack.pop());
        System.out.println("What happens when you dequeue an empty queue: " + queue.dequeue());

    }
}
