package recursive;

public class RecursiveFibonacci {

    public int calcFibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return calcFibonacci(n - 1) + calcFibonacci(n - 2);
    }
}
