/*
// Definition for a Node.
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



**************************************************************************************



A breif explaination before jumping on to the solution:-

1. The question can be done with dfs as well as bfs... but for now i dont know much about queue so i will be doing dfs.

2. As, you all know, we traverse every path in the tree from the leftmost to the rightmost path. The idea is that at every level ( or height lets 1,2,3 etc.) you would be finding nodes again, for eg- let's say you traversed a path and there you reached at level 4 and then you ran out of child nodes and hence of you returned.
3. So int that time what you should do is that you must store the node refernce in an ArrayList or Vector (c++) which you previously encountered at that level. 
4. By doing so, when you will again reach that level while traversing, you would just need to access that previous node and assign its next to the current node (root) and change the previous node at this level tp be the current node.

 5.By doing this recursively for each level, you would end up making tha required linked list for the given level
 
*/

class Solution {
    public Node connect(Node root) {
        List<Node> ans=new ArrayList<>();
        fun(root,ans,0);
        return root;
    }
    void fun(Node root, List<Node> ans, int level){
        if(root==null)return;
        if(level>=ans.size())   // If you are seeing this level for the first time then assign
            ans.add(root);      // the add the node to the Arraylist
                                                
        else{            // If you have actually seen that level before.. then it means you
            ans.get(level).next=root;  // have a node reference waiting in the list for getting
                                       // connected to the current node 
            ans.set(level,root);     // After that just change the previous node with the current node
        }
        fun(root.left,ans,level+1);
        fun(root.right,ans,level+1);
    }
}