import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stack {

    private List<Integer> integers;

    public Stack() {
        integers = new ArrayList<>();
    }

    public void push(Integer i) {
        this.integers.add(0, i);
    }

    public void dump() {
        System.out.println(this.integers.toString().replace("[", "{").replace("]", "}"));
    }

    public void pop() {
        this.integers.remove(this.integers.indexOf(Collections.min(this.integers)));
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Integer(2));
        stack.push(new Integer(7));
        stack.push(new Integer(1));
        stack.push(new Integer(4));
        stack.push(new Integer(5));
        stack.push(new Integer(3));
        stack.pop();
    }
}
