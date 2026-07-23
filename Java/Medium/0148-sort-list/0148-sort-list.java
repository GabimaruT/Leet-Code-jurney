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
        
        ListNode temp = head;
        int size = 0;
        while(temp != null)
        {
            temp = temp.next;
            size++;
        }

        int arr[] = new int[size];
        temp = head;

        for(int i=0; i<size; i++)
        {
            arr[i] = temp.val;
            temp = temp.next;
        }

        Arrays.sort(arr);
        temp = head;

         for(int i=0; i<size; i++)
        {
            temp.val = arr[i];
            temp = temp.next;
        }

        return head;
    }
}