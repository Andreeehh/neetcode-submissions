class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int left = 1, right = max;
        int mid;
        int retHour = max;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
                if (hours > h) {
                    break;
                }
            }
            if (hours > h) {
                left = mid + 1;
            } else {
               retHour = Math.min(retHour, mid);
               right = mid - 1; 
            }
        }
        return retHour;
    }
}
