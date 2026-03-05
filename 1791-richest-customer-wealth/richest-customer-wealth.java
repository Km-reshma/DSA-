class Solution {
   
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; 

        // Loop through each customer (each row in the 2D array)
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; 

            // Loop through each bank account of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j]; // Add money from this account to sum
            }

            // Update maxWealth if current customer's wealth is greater
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth; 
    }
}