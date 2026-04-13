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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        ArrayList<Integer> reversedArr = new ArrayList<>();

        ListNode curr = head;
        while(curr != null){
            
                tempArr.add(curr.val);
                curr = curr.next;
        }
        for(int i = tempArr.size()-1; i >= 0;i--){
            reversedArr.add(tempArr.get(i));
        }
        
        ListNode tempCurr = head;
        for(int i = 0; i < tempArr.size();i++){
            tempCurr.val = reversedArr.get(i);
            tempCurr= tempCurr.next;
        }
        System.out.println(tempCurr);
        return head;
    }
}
