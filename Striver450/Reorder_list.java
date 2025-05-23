public class Reorder_list {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return;

        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        ListNode l1=head;

        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        temp.next=null;
        ListNode reverseList=reverse(slow);
        merge(l1,reverseList);



    }

    public void merge(ListNode l1, ListNode l2)
    {
        while(l1!=null)
        {
            ListNode l1_next=l1.next;
            ListNode l2_next=l2.next;

            l1.next=l2;
            if(l1_next==null)
                break;
            l2.next=l1_next;
            l1=l1_next;
            l2=l2_next;
        }



    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=head;
        while (curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;

    }
}
