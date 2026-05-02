class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int size = nums.length;
       Arrays.sort(nums);
       ArrayList<List<Integer>> fin = new ArrayList<>(); 

       for (int i=0; i < size-2; i++){
        if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
        int lo=i+1;
        int hi = size -1;
       while(lo<hi){
        int sum = nums[lo]+ nums[hi]+nums[i];
        
            if(sum==0){
                List<Integer> f = new ArrayList<>();
                f.add(nums[lo]);
                f.add(nums[i]);
                f.add(nums[hi]);
                fin.add(f);
                lo++;
                hi--;
                while(lo < hi && nums[lo] == nums[lo - 1]) {
                        lo++;
                    }

                
                while(lo < hi && nums[hi] == nums[hi + 1]) {
                        hi--;
                    }
            } else if(sum<0){lo++;}
            else{hi--;}
        }

    
       }
    return fin;
    }
}

