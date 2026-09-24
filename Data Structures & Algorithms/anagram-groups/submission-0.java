class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> checked = new HashMap<>();
        List<List<String>> returnList = new ArrayList<>();
        for (String str : strs) {
            char[] chars1 = str.toCharArray();

            Arrays.sort(chars1);
            String currentSorted = new String(chars1);
            if(checked.containsKey(currentSorted)) {
                checked.get(currentSorted).add(str);
            } else {
                List<String> list = new ArrayList<>();
                returnList.add(list);
                list.add(str);
                checked.put(currentSorted, list);
            }

        }
        return returnList;
    }
}
