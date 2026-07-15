public class TowerOfHanoi {
    public static void solve(int n, char from, char to, char aux) {
        if (n == 0) return;
        solve(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solve(n-1, aux, to, from);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'C', 'B');
    }
}
