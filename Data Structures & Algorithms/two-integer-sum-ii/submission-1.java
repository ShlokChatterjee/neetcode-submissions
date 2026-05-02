class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo = 0;
        int hi = numbers.length-1;
        int[] hp = new int[2];
        while(lo<hi){
            int sum = numbers[lo] + numbers[hi];
            if(sum == target){
                hp[0]=lo+1;
                hp[1]=hi+1;
                break;
            }else if(sum<target){lo++;}
            else{hi--;}
        }
    return hp;
    }
}
