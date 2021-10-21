class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        
        if(root==null) return list;
        //initially we add root
        q.add(root);
        
        while(!q.isEmpty())//till q is empty iterate
        {
            int size = q.size();//get size of current queue that is also the level of q
            //we have to remove from q jitna size hoga bcoz har ek ka left and right milega
            List<Integer> subList = new ArrayList<>();//sublist to store nodes at every level
            
            
            for(int i=0;i<size;i++)
            {
                TreeNode temp = q.remove();//we remove the front of q and add its left and right to q
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                subList.add(temp.val);//now push it to array
            }
            list.add(subList);//push the arrays at each level to a final array
            
        }
        
        return list;
    }
}
