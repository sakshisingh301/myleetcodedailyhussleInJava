import java.util.HashSet;

public class IntersectionOfLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> visited=new HashSet<>();
        while (headB!=null)
        {

            visited.add(headB);
            headB=headB.next;

        }

        while (headA!=null)
        {
            if(visited.contains(headA))
            {
                return headA;
            }
            headA=headA.next;
        }
        return null;

    }

    public static void main(String[] args) {

    }
}
