class Solution {
    public int addDigits(int num) {

        if (num == 0) return 0;   //if nums is equal to zero then return 0. 
        
        return (num % 9 == 0) ? 9 : (num % 9); //if condition is true then return 9 else return num%9(remainder).
    }
}