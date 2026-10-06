class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        int minLen = nums.length/3;
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        int occurrences1 = 0;
        int occurrences2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                occurrences1++;
            }

            if (num == candidate2) {
                occurrences2++;
            }
        }
        List<Integer> ret = new ArrayList();
        if (occurrences1>minLen){
            ret.add(candidate1);
        }
        if (occurrences2>minLen){
            ret.add(candidate2);
        }
        return ret;
    }
}