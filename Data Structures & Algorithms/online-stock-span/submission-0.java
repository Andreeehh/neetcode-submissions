class StockSpanner {

    ArrayList<Integer> list;

    public StockSpanner() {
        this.list = new ArrayList<>();
    }
    
    public int next(int price) {
        int counter = 0;
        list.add(price);
        for (int i = list.size() - 1; i>=0; i--) {
            counter++;
            if (price < list.get(i)) {
                counter--;
                break;
            }
        }
        return counter;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */