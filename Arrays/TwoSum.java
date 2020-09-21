

public class TwoSum {

    //This is the first solution that comes to mind. The brute force solution with high time complexity 
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        int n = nums.length;
        
        for(int i = 0 ; i<n-1 ; i++ ){
            for(int j = i+1 ; j <n ; j++){
                if(nums[i]+nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                   return res;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

