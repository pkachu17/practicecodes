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
        if(head == null) return;
        reorderList(head, head.next);
    }
    public ListNode reorderList(ListNode root, ListNode cur){
        if(cur==null) return root;
        root = reorderList(root, cur.next);
        if(root==null) return null;
        
        ListNode temp =null;
        if(root == cur||root.next==cur){
            cur.next=null;
        }else{
            temp=root.next;
            root.next=cur;
            cur.next=temp;
        }
        return temp;
    }
}