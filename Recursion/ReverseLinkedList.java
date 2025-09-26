public class ReverseLinkedList {

    public IntersectionOfLinkedList.ListNode reverseList(IntersectionOfLinkedList.ListNode head) {
    //base condition, when there is no element or there is one element, in that case we return the node
        if(head==null || head.next==null)
        {
            return head;
        }
        //hypothesis-calling function on smaller input
        IntersectionOfLinkedList.ListNode node=reverseList(head.next);
        //1-->2-->3-->4 => 2-->3-->4
        //4-->3-->2, point 1 to 2 and 1's next to null
        head.next.next=head;
        head.next=null;
        return node;


    }

    public static void main(String[] args) {

    }
}
