public class Merge_Two_Sorted_Lists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy=new ListNode(0);
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode curr=dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                curr.next=l1;
                l1=l1.next;
                curr=curr.next;
            }
            else {
                curr.next=l2;
                l2=l2.next;
                curr=curr.next;
            }
        }
        while (l1!=null)
        {
            curr.next=l1;


        }

        while (l2!=null)
        {
            curr.next=l2;

        }
        return dummy.next;

    }

    public static void main(String[] args) {

    }
}
