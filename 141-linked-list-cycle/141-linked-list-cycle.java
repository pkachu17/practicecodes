/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> m = new HashSet<ListNode>();
        while(head!=null){
            if(m.contains(head)){
                return true;
            }
            m.add(head);
            head = head.next;
        }
        return false;
    }
}