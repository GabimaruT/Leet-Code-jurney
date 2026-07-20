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
        if(head.next == null)
        {
            return null;
        }

        //size
        int size = 0;
        ListNode current = head;
        while(current != null)
        {
            current = current.next;
            size++;
        }

        if(n == size)
        {
            return head.next;
        }

        //to find previous
        int indexTosearch = size-n;
        ListNode prev = head;
        int i=1;
        while(i<indexTosearch)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
        
    }
}