class Solution {
    public int differenceOfSums(int n, int m) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                result -= i;  //if nums i  divisible by m then → subtract
            } else {
                result += i;  // else not divisible by m then  → add
            }
        }
        return result;
    }
}