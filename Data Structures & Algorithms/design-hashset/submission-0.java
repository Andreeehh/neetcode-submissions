class MyHashSet {
    private int length = 0;
    private int[] list = new int[length];
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if (!contains(key)) {
            this.length++;
            int[] prevList = list;
            this.list = new int[this.length];
            for (int i = 0; i < prevList.length; i++) {
                this.list[i] = prevList[i];
            }
            this.list[this.length - 1] = key;
        }
    }
    
    public void remove(int key) {
        if (contains(key)) {
            int[] prevList = list;

            length--;
            list = new int[length];

            int j = 0;

            for (int i = 0; i < prevList.length; i++) {
                if (prevList[i] != key) {
                    list[j] = prevList[i];
                    j++;
                }
            }
        }
    }
    
    public boolean contains(int key) {
        for (int num : this.list) {
            if (key == num) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */