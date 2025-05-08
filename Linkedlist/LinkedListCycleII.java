public class LinkedListCycleII {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

    public ListNode detectCycle(ListNode head) {

          ListNode slow=head;
          ListNode fast=head;
          ListNode p=null;
          ListNode q=head;
          boolean isCycle=false;
          while(fast!=null &&fast.next!=null)
          {
              slow=slow.next;
              fast=fast.next.next;
              if( slow==fast)
              {
                isCycle=true;
                p=slow;
                break;
              }
          }
          if(isCycle==false)
              return null;
          while (p!=q)
          {
              p=p.next;
              q=q.next;
          }
          return p;

    }

    }

    public static void main(String[] args) {

    }
}
