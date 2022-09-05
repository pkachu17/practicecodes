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
        ListNode Temp = new ListNode(0);
        Temp.next = head;
        ListNode first = Temp;
        ListNode second = Temp;
        
        for(int i=0; i<n+1; i++){
            first = first.next;
        }
        
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        return Temp.next;
    }
}