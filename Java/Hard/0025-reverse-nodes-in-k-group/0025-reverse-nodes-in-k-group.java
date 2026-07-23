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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null)
        {
            ListNode kthNode = findKthNode(temp, k);
            if(kthNode == null)
            {
                if(prev != null) prev.next = temp;
                break;
            }

            ListNode kthNext = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if(temp == head)
            {
                head = kthNode;
            }
            else
            {
                prev.next = kthNode;
            }

            prev = temp;
            temp = kthNext;

        }
        return head;
    }

    static ListNode findKthNode(ListNode temp, int k)
    {
        k = k - 1;

        while(temp != null && k > 0)
        {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    static ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;

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