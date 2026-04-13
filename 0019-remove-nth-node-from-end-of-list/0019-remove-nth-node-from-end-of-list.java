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
        int c=0;
        ListNode temp = head;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        if(c==n) return head.next;
        int p =0;
        ListNode rm = head;
        while(p<(c-n-1)){
            p++;
            rm = rm.next;
        }
        ListNode d = rm.next;
        rm.next = d.next;
        d.next = null;
        return head;
    }
}