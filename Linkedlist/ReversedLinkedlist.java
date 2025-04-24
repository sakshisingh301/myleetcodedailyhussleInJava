public class ReversedLinkedlist {

     public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
     ListNode(int val)
     {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
 }
    public ListNode reverseList(ListNode head) {
         if(head==null )
             return null;
         if(head.next==null)
             return head;
         ListNode curr=head;
         ListNode prev=null;
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
