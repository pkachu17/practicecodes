/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    var arr = [];
    while(head!=null){
        arr.push(head.val);
        head = head.next;
    }
    var l=0;
    var r= arr.length-1;
    for(var i=0; i<arr.length; i++){
        if(arr[l]!=arr[r]){
            return false;
        }
        l =l+1;
        r = r-1;
    }
    return true;
};