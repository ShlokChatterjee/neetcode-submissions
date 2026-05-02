class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hp = new HashSet<>();
        int res = 0;
        for(int val: nums){
            hp.add(val);
        }
        for (int val: nums){
            if(hp.contains(val) && !hp.contains(val-1)){
                int curr = val, count = 0;

                while(hp.contains(curr)){
                    hp.remove(curr);
                    curr++;
                    count++;
                }
                res = Math.max(res, count);
            }
            
        }
        return res;
}
}
