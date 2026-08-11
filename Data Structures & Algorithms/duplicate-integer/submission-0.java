class Solution {
    public boolean hasDuplicate(int[] nums) {


        int arrLength=nums.length;

        Set<Integer> set=new HashSet<>();

        for(int num:nums)
        {
            set.add(num);
        }
        if(set.size()!=arrLength)
        {
            return true;
        }
        return false;

        
    }
}