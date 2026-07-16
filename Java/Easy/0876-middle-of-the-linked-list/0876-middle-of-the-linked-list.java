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
        ListNode temp = head;
        int mid = 0;
        int counter = 0;

        while(temp != null)
        {
            mid++;
            temp = temp.next;
        }

        mid = (mid / 2) ;
        temp = head;

        while(counter < mid)
        {
            counter++;
            temp = temp.next;
        }

        return temp;
    }
}