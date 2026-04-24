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
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            length +=1;
            curr = curr.next;
        }
        
        ListNode temp = head;
        ListNode result = temp;
        for (int i = 0; i < length-n-1; i++){
            temp = temp.next;
        }
        if(length == n){
            return head.next;
        }
        System.out.println(temp.val);
        temp.next = temp.next.next;
        System.out.println(temp.val);
        return result;

    }
}
