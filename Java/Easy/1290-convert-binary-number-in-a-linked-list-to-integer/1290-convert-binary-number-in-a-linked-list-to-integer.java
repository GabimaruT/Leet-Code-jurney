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
    public int getDecimalValue(ListNode head) {
        
        head = reverse(head);
        ListNode temp = head;
        int ans =  0;
        int i = 0;

        while(temp != null)
        {
            if(temp.val == 1)
            {
                ans += Math.pow(2,i);
            }
            i++;
            temp = temp.next;
        }
        return ans;
    }
    static ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}