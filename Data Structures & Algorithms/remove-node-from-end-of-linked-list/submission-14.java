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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;

        while(curr != null){
            length += 1;
            curr = curr.next;
        }
       
        

        ListNode temp = head;
        ListNode res = temp;
        for (int i = 0; i < length - n - 1; i++){
            temp = temp.next;
        }
        
        if (length == n){
            return head.next;
        }
        temp.next = temp.next.next;
        return res;

    }
}
