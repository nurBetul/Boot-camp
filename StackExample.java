package Java8Week;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(10);
        myStack.push(50);
        myStack.push(70);
        System.out.println(myStack);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.peek());
    }
}
