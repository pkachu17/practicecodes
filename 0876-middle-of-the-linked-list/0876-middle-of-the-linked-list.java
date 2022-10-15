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
    public ListNode middleNode(ListNode head) {
        int size=0;
        for(ListNode i=head; i!=null; i = i.next){
            size++;
        }
        size = size/2;
        for(int j=0; j<size; j++){
            head = head.next;
        }
        return head;
    }
}