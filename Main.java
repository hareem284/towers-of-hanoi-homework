
public class Main {

    public static void main(String[] args) {
        hanoi(6, 1, 2, 3);
    }

    public static void hanoi(int n, int from, int to, int spare) {

        if (n == 1) {
            System.out.println("Move disk from Tower " + from + " to Tower " + to);
        } else {
            hanoi(n - 1, from, spare, to);

            System.out.println("Move disk from Tower " + from + " to Tower " + to);

            hanoi(n - 1, spare, to, from);
        }
    }
}
