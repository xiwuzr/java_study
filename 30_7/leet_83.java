package exercise;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 class ListNode {
     int val;
    ListNode next;
     ListNode(int x) { val = x; }
 }

public class leet_83 {

}

class Solution83 {
      ListNode deleteDuplicates(ListNode head) {
          if(head==null){
              return head;
          }
          ListNode Head=new ListNode(0);
          Head.next=head;
          ListNode tmp=Head;
          while(tmp.next.next!=null){
              if(tmp.next.val==tmp.next.next.val){
                  tmp.next=tmp.next.next;
              }
              else
              tmp=tmp.next;
          }
          return Head.next;

    }
}
