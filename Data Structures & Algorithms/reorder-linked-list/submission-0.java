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
        ListNode lo = head;
        ListNode hi = head.next;

        while(hi != null && hi.next != null ){
            lo = lo.next;
            hi = hi.next.next;
        }

        ListNode sec = lo.next;
        ListNode prev = lo.next = null;

        while ( sec != null ){
        ListNode temp = sec.next;
        sec.next = prev;
        prev = sec;
        sec = temp;
        }
        ListNode first = head;
        sec = prev;
        while(sec != null){
            ListNode tmp1 =first.next;
            ListNode tmp2 = sec.next;
            first.next = sec;
            sec.next = tmp1;
            first = tmp1;
            sec = tmp2;
        }
        
    }
}
