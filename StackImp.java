// Implementation of Stack using ArrayList

import java.util.*;
public class StackImp {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Empty 
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }


    // push at bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }


    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        // stack s = new stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        pushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }


        // while (!s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
    }
}
