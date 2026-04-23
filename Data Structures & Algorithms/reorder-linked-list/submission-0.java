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
    public void reorderList(ListNode head) {
        
        int length = 0;
        ListNode node1 = head;
        while(node1 != null){
            length +=1 ;
            node1 = node1.next;
        }
        ListNode[] arr1 = new ListNode[length];
        ListNode temp = head;
        for(int i = 0; i < length;i++){
            arr1[i] = temp;
            temp = temp.next;
        }
        int p1 = 0;
        int p2 = arr1.length-1;

        ListNode curr = head;
        while (p1 < p2){
            
            curr.next = arr1[p2];
            p1++;
            curr.next.next = arr1[p1];
            p2--;

            curr = curr.next.next;
        }
        curr.next = null;
    }
}
