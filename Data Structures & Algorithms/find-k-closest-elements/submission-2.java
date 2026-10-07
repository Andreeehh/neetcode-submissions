class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int searchIndex = 0;
        List<Integer> ret = new ArrayList<>();

        while (searchIndex < arr.length) {
            if (ret.size() < k) {
                ret.add(arr[searchIndex]);
            } else {
                if (arr[searchIndex] - x < x - ret.get(0)) {
                    ret.remove(0);
                    ret.add(arr[searchIndex]);
                } else {
                    break;
                }
            }

            searchIndex++;
        }

        return ret;
    }
}