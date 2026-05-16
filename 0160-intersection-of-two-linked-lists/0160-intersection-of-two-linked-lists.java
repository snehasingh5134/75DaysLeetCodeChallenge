/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        for(ListNode ls = temp1; temp1 != null; temp1 = temp1.next){
            temp2 = headB;
            for(ListNode l = temp2; temp2 != null; temp2 = temp2.next){
                if(temp1 == temp2) return temp1;
            }
        }
        return null;
    }
}