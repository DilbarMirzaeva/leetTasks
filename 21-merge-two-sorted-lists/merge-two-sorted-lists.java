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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list=new ArrayList<>();
         
         ListNode curr=list1;
         while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
         }

         curr=list2;
         while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
         }

         Collections.sort(list);

         ListNode d=new ListNode(0);
         curr=d;

         for(int a:list){
            curr.next=new ListNode(a);
            curr=curr.next;
         }

         return d.next;

    }
}