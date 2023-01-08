public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;

        int before1s = 2;
        int before2s = 1;

        int resultOfi = 0;
        for (int i = 3; i <= n; i++) {
            resultOfi = before1s + before2s;
            // rise one step
            before2s = before1s;
            before1s = resultOfi;
        }

        return resultOfi;
    }
}
