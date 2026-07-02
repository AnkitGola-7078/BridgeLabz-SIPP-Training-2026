class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Age", 25);
        System.out.println(p);
    }
}
