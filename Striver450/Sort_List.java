public class Sort_List {

    public class ListNode {
      int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode sortList(ListNode head) {
        if(head==null)
            return null;

        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;


        while(fast!=null || fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;



        }
        temp.next=null;
        ListNode first_half=head;
        ListNode second_half=slow;
       return merge(first_half,second_half);

    }

    public ListNode merge(ListNode listNode1,ListNode listNode2)
    {

        ListNode dummyNode=new ListNode(0);
        while (listNode1!=null && listNode2!=null)
        {
            if(listNode1.val<=listNode2.val)
            {
                dummyNode.next=listNode1;
                listNode1=listNode1.next;
            }
            else {
                dummyNode.next=listNode2;
                listNode2=listNode2.next;
            }
        }

        while (listNode1!=null)
        {
            dummyNode.next=listNode1;
            listNode1=listNode1.next;
        }

        return null;

    }

    public static void main(String[] args) {

    }
}
