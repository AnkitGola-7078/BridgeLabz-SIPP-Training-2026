class Stack<T> {
    private java.util.LinkedList<T> list = new java.util.LinkedList<>();

    public void push(T item) { list.addFirst(item); }
    public T pop() { return list.removeFirst(); }
    public boolean isEmpty() { return list.isEmpty(); }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("B");
        System.out.println(s.pop()); // B
    }
}
