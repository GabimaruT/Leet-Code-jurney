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
    public ListNode sortList(ListNode head) {
        
        return divide(head);
    }

    static ListNode divide(ListNode head)
    {
        if(head == null || head.next == null) return head;

        ListNode mid = findMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = divide(left);
        right = divide(right);

        return conqure(left, right);
    }

    static ListNode findMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static ListNode conqure(ListNode left, ListNode right)
    {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(left != null && right != null)
        {
            if(left.val < right.val)
            {
                temp.next = left;
                left = left.next;
            }
            else
            {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (left != null) temp.next = left;
        if (right != null) temp.next = right;
        return dummy.next;
    }
}