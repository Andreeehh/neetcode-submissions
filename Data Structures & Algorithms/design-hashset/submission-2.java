class MyHashSet {
    private boolean[] values = new boolean[1000001];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        values[key] = true;
    }
    
    public void remove(int key) {
        values[key] = false;
    }
    
    public boolean contains(int key) {
        return values[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */