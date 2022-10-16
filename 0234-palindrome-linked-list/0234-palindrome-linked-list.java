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
    public boolean isPalindrome(ListNode head) {
        List<Integer> headVals = new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            headVals.add(cur.val);
            cur = cur.next;
        }
        int i=0; 
        int j = headVals.size()-1;
        while(i<j){
            if(!headVals.get(i).equals(headVals.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}