import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {


// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


    class Solution {
        public Node cloneGraph(Node node) {

            HashMap<Node, Node> map = null;
            return CloneUtil(node,map);



        }

        private Node CloneUtil(Node node, HashMap<Node, Node> map) {

            Node newNode=new Node(node.val);
            map.put(node,newNode);
            for(Node neighbour: node.neighbors)
            {
                if(!map.containsKey(neighbour))
                {
                    //clone it
                    newNode.neighbors.add(CloneUtil(neighbour,map));



                }
                else {
                    //already cloned
                    newNode.neighbors.add(map.get(neighbour));


                }
            }
            return newNode;
        }
    }
}
