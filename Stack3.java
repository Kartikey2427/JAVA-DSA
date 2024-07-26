import java.util.*;

public class Stack3 {
    
    public static void pushToBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            
        }
        int top = s.pop();
        pushToBottom(s, data);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushToBottom(s, 4);
    }
}
