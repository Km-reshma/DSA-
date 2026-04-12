/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;        // 1 step
//             fast = fast.next.next;   // 2 steps
//         }

//         return slow;
//     }
// }


class Solution {
    public ListNode middleNode(ListNode head) {
        
    //1. first we find the length of linked list
        int count =0;
        ListNode temp=head;
        while(temp!=null){
            count ++;
            temp=temp.next;
        }

    //2. Find the mid
         
         int mid =count/2;

         temp =head;

    //3. Find the middle element
        
         for(int i=0; i<mid; i++){
            temp=temp.next;

         }
         
        return temp;
    }
}