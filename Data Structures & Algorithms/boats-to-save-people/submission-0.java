class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int boats = 0;
        while (left <= right) {
            int sum = people[left] + people[right];
            
            if (sum > limit) {
                right--;
            } else {
                right --;
                left++;
            }

            boats++;
        }
        if (left == right) {
            boats++;
        }
        return boats;
    }
}