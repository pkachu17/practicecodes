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
    public ListNode detectCycle(ListNode head) {
//         HashMap<Integer, Integer> map = new HashMap();
//         int count =-1;
//         while(head!=null){
//             count++;
//             if(map.containsKey(head.val)){
//                 int x = head.val;
//                 return new ListNode(map.get(x));
                
//             }else{
//                 map.put(head.val, count);
//                 head = head.next;
//             }
//         }
//         return null;
//     }
    Set<ListNode> h = new HashSet<>();
        
        while(head != null)
        {
            if(h.contains(head))
                return head;
            h.add(head);
            head = head.next;
        }
        return null;
    }
}