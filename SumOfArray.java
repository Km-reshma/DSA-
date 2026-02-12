// Leetcode Problem number => Sum Of Array's elements.

public class SumOfArray{

public static void main(String[] args){

    int sum = 0;
    
    int[] arr = {2,5,9,7,5};

    for(int i = 0; i < arr.length; i++){

        sum= sum+arr[i];
    }

    System.out.println(sum);
}
}