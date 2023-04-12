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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode odd = new ListNode(0);
        ListNode oddtemp = odd;
        ListNode even = new ListNode(0);
        ListNode eventemp = even;
        int i = 0;
        while(temp != null){
            if(i%2 == 0){
                eventemp.next = temp;
                eventemp = eventemp.next;
            }
            else{
                oddtemp.next = temp;
                oddtemp = oddtemp.next;
            }
            i++;
            temp = temp.next;
        }
    oddtemp.next = null;
    eventemp.next=odd.next;
    return even.next;
    }
}
