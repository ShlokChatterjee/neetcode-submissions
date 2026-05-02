class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dp = new HashSet<>();
        for (int num : nums){
            if(dp.contains(num)){
                return true;
            }
            dp.add(num);
        }
        return false;
    }
}