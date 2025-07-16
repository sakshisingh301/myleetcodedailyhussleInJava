public class SwapNodesinPairs {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prevNode=dummy;
         while(head.next!=null)
         {
             ListNode firstNode=head;
             ListNode secondNode=head.next;
             prevNode.next=secondNode;
             firstNode.next=secondNode.next;
             secondNode.next=firstNode;
             prevNode=firstNode;
             firstNode=firstNode.next;
         }
         return dummy.next;



    }
}
