package iterative;

public class IterativeFibonacci {

    public int calcFibonacci(final int n) {

        if (n <= 1) {
            return n;

        } else {
            int preLast = 0;
            int last = 1;

            for (int i = 2; i <= n; i++) {
                int next = preLast + last;
                preLast = last;
                last = next;
            }

            return last;
        }
    }
}