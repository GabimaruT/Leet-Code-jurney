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
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        int size = 0;

        ListNode temp = head;

        while(temp != slow)
        {
            temp = temp.next;
            size++;
        }

        temp = head;

        int i = 0;

        while(i < size-1)
        {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        return head;
    }
}