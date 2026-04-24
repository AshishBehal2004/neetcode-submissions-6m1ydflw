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
        int l = 0;
        while(curr != null){
            l+=1;
            curr = curr.next;
        }
        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;
        for (int i = 0; i < l;i++){
            list.add(temp);
            temp = temp.next;
        }

        list.remove(list.size()-n);
        

        ListNode result = new ListNode();
        ListNode curr2 = result;
        for (int i = 0; i < list.size();i++){
            result.next = list.get(i);
            result = result.next;
        }
        result.next = null;
        return curr2.next;
    }
}
