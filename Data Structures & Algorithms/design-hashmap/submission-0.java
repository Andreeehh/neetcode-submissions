class MyHashMap {

    private int[] values;
    private boolean[] keys;

    public MyHashMap() {
        this.values = new int[1000001];
        this.keys = new boolean[1000001];
    }
    
    public void put(int key, int value) {
        this.keys[key] = true;
        this.values[key] = value;
    }
    
    public int get(int key) {
        if (this.keys[key]) {
            return this.values[key];
        }
        return -1;
    }
    
    public void remove(int key) {
        this.keys[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */