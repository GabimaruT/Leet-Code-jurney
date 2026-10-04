class StockSpanner {
    static List<Integer> days;
    public StockSpanner() {
        days = new ArrayList<>();
    }
    
    public int next(int price) {
        days.add(price);
        int count = 1;

        for(int i=days.size()-2; i>=0; i--)
        {
            if(price >= days.get(i)) 
            {
                count++;
            }
            else
            {
                break;
            }
        }

        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */