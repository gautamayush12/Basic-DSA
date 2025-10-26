package LinkedList;


  public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode h1 = new ListNode(0);
        ListNode h3 = new ListNode(0);
        ListNode t1 = h1;
        ListNode t3 = h3;
        ListNode curr = head;

        while(curr != null){
            if(curr.val<x){
                t1.next = curr;
                t1 = t1.next;
            }else{
                t3.next = curr;
                t3 = t3.next;
            }
            curr = curr.next;
        }

        //Merging and connecting lists
        t3.next = null;
        t1.next = h3.next;
        return h1.next;
    }
}