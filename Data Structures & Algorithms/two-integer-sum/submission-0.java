class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checked = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (checked.containsKey(complement)) {
                return new int[] {
                    checked.get(complement),
                    i
                };
            }

            checked.put(nums[i], i);
        }

        return new int[] {};
    }
}
