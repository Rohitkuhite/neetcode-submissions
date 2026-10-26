class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int k = 0;
        int[] ans = new int[n*2];
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == nums[i]){
                ans[i] = nums[i];
            }
        }
        for(int  j = n ; j < n*2 ; j++){
          
           if(nums[k] == nums[k]){
            ans[j] = nums[k];
            k++;
           }
        }
        return ans;
    }
}