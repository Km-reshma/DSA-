class Solution {
    public int countDigits(int num) {
        int count = 0;
        int original = num;
        
        while (num > 0) {
            int digit = num % 10; //extract the number
            
            if (original % digit == 0) {
                count++;
            }
            
            num = num / 10; //remove the digits
        }
        
        return count;
    }
}