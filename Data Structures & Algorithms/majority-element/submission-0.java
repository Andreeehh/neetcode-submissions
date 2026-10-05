class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int majorityElement = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
            if (counter.get(num) > majority) {
                majority = counter.get(num);
                majorityElement = num;
            }
        }
        return majorityElement;
    }
}