class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int answer[] = new int[n];
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int temp = nums[0];
        prefix[0] = 1;
        for(int i=1;i<n;i++) {
            prefix[i] = temp;
            temp = temp * nums[i];
        }
        temp = nums[n-1];
        suffix[n-1] = 1;
        for(int j=n-2;j>=0;j--) {
            suffix[j] = temp;
            temp = temp * nums[j];
        }
        for(int k=0;k<n;k++) {
            answer[k] = prefix[k] * suffix[k];
        }
        return answer;
    }
}  
