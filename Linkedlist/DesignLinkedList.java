public class DesignLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val)
        {
            this.val=val;
        }
    }
    private Node head;
    int size;



    public DesignLinkedList() {

    }

    public int get(int index) {

        Node curr=head;
        for(int i=0;i<index;i++)
        {
            curr=curr.next;
        }
        return curr.val;

    }

    public void addAtHead(int val) {

       Node node=new Node(val);
       node.next=head;
       head=node;
       size++;

    }

    public void addAtTail(int val) {
        Node node =new Node(val);
        Node curr=head;
        size++;
        while(curr!=null)
        {
            curr=curr.next;
        }
        curr.next=node;
        node.next=null;

    }

    public void addAtIndex(int index, int val) {
        Node node=new Node(val);
        Node curr=head;
      if(index>size)
      {
        return;
      }
      if(index==0)
      {

          size++;
          addAtHead(val);
      }
      else {
          for(int i=0;i<index;i++)
          {
              curr=curr.next;
          }
          Node temp=curr.next;
          curr.next=node;
          node.next=temp;
          size++;

      }






    }

    public void deleteAtIndex(int index) {
        Node curr=head;

       if(index<0 || index>size)
           return;
       if(index==0)
       {
           head=head.next;
           size--;
       }
       else {
           for(int i=0;i<index;i++)
           {

             curr=curr.next;
           }
           curr.next=curr.next.next;
           size--;
       }

    }

    public static void main(String[] args) {

    }
}
