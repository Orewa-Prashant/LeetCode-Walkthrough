/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<Node> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            List<Integer> currList=new ArrayList<>();
            int len=qu.size();
            for(int i=0;i<len;i++){
                Node curr=qu.poll();
                currList.add(curr.val);
                List<Node> currChildren=curr.children;
                for(int j=0;j<currChildren.size();j++){
                    qu.add(currChildren.get(j));
                }
            }
            ans.add(currList);
        }
        return ans;
    }
}