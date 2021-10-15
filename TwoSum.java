class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        //res[0] will have arr element and res[1] will have index
        //iterate array
        for(int i=0;i<nums.length;i++)
        {
            //if already in map then return previous index from map and current index
            if(map.containsKey(target-nums[i]))
            {
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            //if not in map then add to map
            map.put(nums[i],i);
        }
        return res;
    }
}
