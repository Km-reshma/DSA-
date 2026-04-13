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
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         //using two pass approach ( means counting)

//         int count =0;
//         ListNode temp =head;                      //1. Find the length of the linked list
//         while(temp!=null){
//             count++;
//             temp=temp.next;

//         }

//         if(count ==n){
//             return head.next;
//                     //edge case , suppose jo end se node if n =3 or total bhi 3 hai 

//         }
        
//         int steps=count -n;
//         temp=head;
//         for(int i=1; i<steps;i++){
//             temp=temp.next;
//         }
//         temp.next=temp.next.next;
//         return head;
        


//     }
// }






class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;

        // move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // if fast becomes null → remove head
        if (fast == null) {
            return head.next;
        }

        // move both pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // delete node
        slow.next = slow.next.next;

        return head;
    }
}