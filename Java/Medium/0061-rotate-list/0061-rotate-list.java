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
    public ListNode rotateRight(ListNode head, int k) {

         if(head == null || head.next == null)
        {
            return head;
        }
        
        int n = size(head);
        k = k%n;
        if(k==0) return head;
        
       
        ListNode Last;
        ListNode secondLast;
        
        for(int i=0;i<k;i++)
       {
         Last = head.next;
         secondLast = head;
         while(Last.next != null)
        {
            Last = Last.next;
            secondLast = secondLast.next;
        }
        Last.next = head;
        head = Last;
        secondLast.next = null;
       }
       return head;
    }
    static int size(ListNode head)
    {
        int n=0;
        while(head != null)
        {
            head = head.next;
            n++;
        }
        return n;
    }
}