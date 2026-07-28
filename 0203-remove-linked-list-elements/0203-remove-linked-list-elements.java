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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       // val = jis value wali nodes ko linked list se remove karna hai
        // Agar starting mein val hai,
        // toh head ko aage move karo
        while(head!=null && head.val==val){
            head=head.next;
        }
        // Current ko head se start karo
        ListNode current=head;
        // Jab tak next node exist karti hai
         while(current!=null && current.next!=null){
             // Kya next node ki value delete wali value hai?
            if(current.next.val==val){
               //true--> next node ko skip kar do
                current.next=current.next.next;
            }
            else{

                current=current.next;
            }
        }
        return head;
    }
}