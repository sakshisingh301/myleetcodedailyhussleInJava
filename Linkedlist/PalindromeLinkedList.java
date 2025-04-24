public class PalindromeLinkedList {

    class ListNode {
        int val;
      ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    //in previous methods i was calculating the length and then on the basis of length i was diving the linkedlist into
    //two halves, but improved the solution by not counting the length  rather diving the list by tortoise and the hare algo only
    public boolean isPalindrome(ListNode head) {
            ListNode firstHalf=head;
            ListNode secondHalfHead=null;
            ListNode slow=head;
            ListNode fast=head;
            if(head.next==null)
                return true;
            if(head.next.val== head.val &&head.next.next==null)
                return true;
            if(head.next.val!=head.val &&head.next.next==null)
                return false;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            if(fast!=null)
            {
                secondHalfHead=reverseLinkedList(slow.next);
            }
            else {
                secondHalfHead=reverseLinkedList(slow);
            }

            ListNode secondHalf=secondHalfHead;
            while(firstHalf!=null && secondHalf!=null)
            {
                if(firstHalf.val!=secondHalf.val)
                {
                    return false;
                }
                firstHalf=firstHalf.next;
                secondHalf=secondHalf.next;
            }
            return true;

    }

    }

    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode currNext=head;
        while(curr!=null)
        {
            currNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currNext;
        }
        head=prev;
        return head;




    }

    public static void main(String[] args) {

    }
}
