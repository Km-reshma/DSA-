//reverse of given any array elements

public class ReverseOfArray {

    public static void main(String[] args) {

        int[] arr = {2, 9, 7, 4, -1};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}