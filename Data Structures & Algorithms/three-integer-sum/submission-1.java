class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ret = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];

            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex) {

                int sum = nums[leftIndex] + nums[rightIndex];

                if (sum == target) {

                    ret.add(List.of(
                        nums[i],
                        nums[leftIndex],
                        nums[rightIndex]
                    ));

                    leftIndex++;
                    rightIndex--;

                    while (leftIndex < rightIndex &&
                           nums[leftIndex] == nums[leftIndex - 1]) {
                        leftIndex++;
                    }

                    while (leftIndex < rightIndex &&
                           nums[rightIndex] == nums[rightIndex + 1]) {
                        rightIndex--;
                    }

                } else if (sum < target) {
                    leftIndex++;

                } else {
                    rightIndex--;
                }
            }
        }

        return ret;
    }
}