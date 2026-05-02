class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hp.containsKey(nums[i])) {
                arr[0] = hp.get(nums[i]);
                arr[1] = i;
                return arr;
            }
            hp.put(diff, i);
        }
        return arr;
    }
}