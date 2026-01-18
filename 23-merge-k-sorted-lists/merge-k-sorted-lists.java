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
    public ListNode mergeKLists(ListNode[] lists) {
         List<Integer> l=new ArrayList<>();

         for(ListNode node:lists){
            while(node!=null){
                l.add(node.val);
                node=node.next;
            }
         }

         Collections.sort(l);

         ListNode dummy=new ListNode(0);
         ListNode cur=dummy;

         for(int val:l){
            cur.next=new ListNode(val);
            cur=cur.next;
         }

         return dummy.next;
       
    }
}