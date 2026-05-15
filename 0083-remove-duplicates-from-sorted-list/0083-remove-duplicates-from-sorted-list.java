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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev;
        while(temp != null){
            prev = temp;
            while(temp.next != null && temp.val == temp.next.val){
                temp = temp.next;
            }
                temp = temp.next;
                prev.next = temp;  
        }
        return head;
    }
}