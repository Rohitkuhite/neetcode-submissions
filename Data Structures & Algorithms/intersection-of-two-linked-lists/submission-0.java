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
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;
        int length1 = 1;
        int length2 = 1;

        while(dummy1 != null){
            length1++;
            dummy1 = dummy1.next;
        }
        while(dummy2 != null){
            length2++;
            dummy2 = dummy2.next;
        }
        
         int d = Math.abs(length1-length2);

        if(length1 >= length2){
          while(d>0){
            temp1 = temp1.next;
            d--;
          }
        }else{
            while(d>0){
            temp2 = temp2.next;
            d--;
          }
        }
         boolean flag = false;

        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                flag = true;
                break;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return flag ? temp1 : null;
    }
}