class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int answer[] = new int[n];
        for(int i=0, temp = 1; i<n; i++) {
            answer[i] = temp;
            temp = temp * nums[i];
        }
        for(int i = n-1, temp = 1; i>=0; i--) {
            answer[i] *= temp;
            temp = temp * nums[i];
        }
        return answer;
    }
}  
