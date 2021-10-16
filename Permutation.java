class Solution {
    public void findPermute(int index,List<Integer> nums,List<List<Integer>> ans)
    {
        //when we reach leaf of tree, we get the required ans
        if(index==nums.size())
        {
            ans.add(new ArrayList<>(nums));
            return;
        }
        
        //for every iteration we make one fixed and iterate whatever is after
        for(int i=index;i<nums.size();i++)
        {
            Collections.swap(nums,i,index);//swap i and index
            findPermute(index+1,nums,ans);
            Collections.swap(nums,index,i);//swap back index and i for backtracking
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            num.add(nums[i]);
        findPermute(0,num,ans);
        return ans;
    }
}
