import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    //this solution is taking 3ms
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int size= queue.size();

            for(int i=0;i<size;i++)
            {
                Node curr=queue.poll();
                if(curr!=null) {
                    if(curr.left!=null)
                    {
                        queue.add(curr.left);
                    }
                    if(curr.right!=null)
                    {
                        queue.add(curr.right);
                    }
                    if (i < size - 1) {
                        curr.next=queue.peek();
                    } else {
                        curr.next = null;
                    }
                }
            }

        }
        return root;
    }

    public Node connectBetter(Node root)
    {
        if(root==null) return null;

        Node level=root;

        while (level.left!=null)
        {
            Node curr=level;
            curr.left.next=curr.right;
            if(curr.right.next!=null)
            {
                curr.right.next=curr.next.left;
            }
            curr=curr.next;
            level=level.left;
        }

            return root;
    }
}


