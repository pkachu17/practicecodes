/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    var cur = head;
    
    while (cur){
        while(cur.next && cur.next.val == cur.val){
            cur.next = cur.next.next;
        }
        cur = cur.next;
    }
    return head;
};