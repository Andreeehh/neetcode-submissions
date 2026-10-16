class TimeMap {
    HashMap<String, List<Pair<Integer, String>>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<Pair<Integer, String>> list = timeMap.getOrDefault(key, new ArrayList<>());

        list.add(new Pair<>(timestamp, value));

        timeMap.put(key, list);
    }

    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> list = timeMap.get(key);

        if (list == null) {
            return "";
        }

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currentTimestamp = list.get(mid).getKey();

            if (currentTimestamp == timestamp) {
                return list.get(mid).getValue();
            } else if (currentTimestamp < timestamp) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (right < 0) {
            return "";
        }

        return list.get(right).getValue();
    }
}
