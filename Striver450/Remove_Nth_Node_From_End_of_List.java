public class Remove_Nth_Node_From_End_of_List {

    public class ListNode {
        int val;
      ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy=new ListNode(0);
    int length=0;
    ListNode curr=head;
    while(curr!=null)
    {
        length++;
        curr=curr.next;
    }
    length=length-n;
    dummy.next=curr;
    curr=dummy;

    while(length>0)
    {
        length--;
        curr=curr.next;
    }
    curr.next=curr.next.next;
    return dummy.next;

    }
    //head = [1,2,3,4,5], n = 2


}
