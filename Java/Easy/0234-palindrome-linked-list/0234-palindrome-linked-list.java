import java.util.*;
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
    public ListNode reverse (ListNode head)
    {
        ListNode prev = null;
        ListNode curr =head;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode FindMidd(ListNode head)
    {
        ListNode turtle = head;
        ListNode rabit = head;

        while(rabit.next !=null && rabit.next.next != null)
        {
            rabit = rabit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        ListNode middle = FindMidd(head);
        ListNode secondHalf = reverse(middle.next);
        ListNode firstHalf = head;

        while(secondHalf !=null)
        {
            if(firstHalf.val != secondHalf.val)
            {
                return false;
            }
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;

        }
        return true;
    }
    
}