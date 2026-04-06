class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j=0, n=numbers.length-1;
        int ans[] = new int[2];
        for(i=0,j=n;i<j;) {
            if(numbers[i]+numbers[j] == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                return ans;
            }
            else if(numbers[i]+numbers[j] > target) {
                j--;
            }
            else if(numbers[i]+numbers[j] < target) {
                i++;
            }
        }
        return ans;
    }
}
