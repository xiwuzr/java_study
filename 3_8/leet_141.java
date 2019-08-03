package exercise;

public class leet_141 {
}



class Solution141 {
    //Definition for singly-linked list.内部类
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;

        }
        ListNode p=head;
        ListNode q=head;
        if(q.next!=null&&q.next.next!=null) {
            q=q.next.next;
            p=p.next;
        }else{
            return false;
        }
        int book=0;
        while(p!=q){
            if(q.next==null||q.next.next==null){
                book=1;
                break;
            }
            q=q.next.next;
            p=p.next;
        }
        if(book==1){
            return false;
        }else{
            return true;
        }
    }
}
