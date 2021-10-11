class Solution {
    public int mySqrt(int x) {
        double x0 = 1;
        double solve = 0;
        int iter = 25;

        if (x < 100000) {
            iter = 10;
        }
        
        for (int i = 0; i < iter; i++) {
            solve = (x0 + x/x0)*0.5;
            x0 = solve;
        }

        return (int) Math.floor(solve);
    }
}
