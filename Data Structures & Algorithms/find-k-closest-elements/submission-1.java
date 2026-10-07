class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int searchIndex = 0;
        List<Integer> ret = new ArrayList<>();
        while (searchIndex < arr.length) {
            ret.add(arr[searchIndex]);
            if (ret.size() > k) {
                if (arr[searchIndex] - x < x - ret.get(0)) {
                    ret.remove(0);
                } else {
                    ret.remove(k);
                    break;
                }
            }
            searchIndex++;
        }
        return ret;
    }
}