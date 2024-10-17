class Solution {

    // n -> 5
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        for(int i = 0; i < n - 1; i++) {
            int temp = a;
            a = b + a;
            b = temp;
        }
        return a;
       
    }

     public int climbStairs(int n) {
        int total = 0;
        if(n <= 1) {
            return total+1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
