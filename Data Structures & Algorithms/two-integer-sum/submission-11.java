class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }
        int result[] = new int[2];
        for(int i=0; i<nums.length;i++) {
            int y = target - nums[i];
            if(map.containsKey(y) && i!=map.get(y)) {
                result[0] = i;
                result[1] = map.get(y);
                return result;
            }
        }
        return result;
    }
}
