class Solution {
    public int maxArea(int[] heights) {

        int vol = 0, right = heights.length-1;
        System.out.println();
        for (int left = 0; left < heights.length -1; left++) {
            right = heights.length-1;
            while (left < right) {
                int leftHeight = heights[left];
                int rightHeight = heights[right];
                
                if (leftHeight >= rightHeight) {
                    vol = Math.max(vol, rightHeight * (right - left));
                    right --;
                } else {
                    vol = Math.max(vol, leftHeight * (right - left));
                    left ++;
                }
            }
        } 
        return vol;
    }
}
