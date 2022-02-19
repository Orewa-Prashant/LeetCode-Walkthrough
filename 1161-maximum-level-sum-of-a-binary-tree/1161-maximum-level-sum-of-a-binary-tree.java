/*
 A Little explaination going into the solution
 
 1. The basic idea is to have an Arraylist or List to store the sum of all the values at their respective indexes.
 2. Root of the tree will be at index at 0, its child node's sum will be at index 1 and so on.
 3. After you have finished traversing the tree and have the sum of all the levels, you just have to traverse the Arraylist and find which level has the maximal sum.
 
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        fun(root,0,al);
        int max=Integer.MIN_VALUE;
        int id=0;
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            if(max<al.get(i)){
                max=al.get(i);
                id=i;    //Find the index that contains the maximal value
            }
        }
        return id+1;
    }
    void fun(TreeNode root, int k, ArrayList<Integer> al){
        if(root==null)return ;
        if(k>=al.size()){
            al.add(root.val);    //When you are encountering a level for the frst time, be sure to allocate space for it in the Arraylist.
        }
        else    //rest of the time you h-just have to update the sum of the levels.
        al.set(k,al.get(k)+root.val);
        fun(root.left,k+1,al);
        fun(root.right,k+1,al);
    }
}