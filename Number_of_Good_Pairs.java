class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> ans = new HashMap<>();
        for(int num : nums){
            count += ans.getOrDefault(num, 0);
            ans.put(num, ans.getOrDefault(num, 0)+1);
        }
        return count;
    }
}
