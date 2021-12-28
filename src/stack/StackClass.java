package stack;

public class StackClass{
    public static void main(String[] args) {
        StackOperationsImple stack = new StackOperationsImple();
        stack.pushInteger(1);
        stack.pushInteger(2);
        stack.pushInteger(3);
        System.out.println(stack.printTop());
        stack.popInteger();
        stack.pushInteger(4);
        System.out.println(stack.printTop());
    }
}
