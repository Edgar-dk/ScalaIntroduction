/**
 * @author Edgar
 * @create 2022-10-13 18:49
 * @faction:
 */
public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial.factFor(5));
        System.out.println(factorial.fact(5));
    }

    public static int factFor(int n) {
        int result=1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fact(int n) {
        if (n == 0) return 1;
        return fact(n - 1) * n;
    }
}
