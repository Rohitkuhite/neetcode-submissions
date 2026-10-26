class StockSpanner {

    Stack<int[]> st = new Stack<>();
    int currentDay = 0;

    public StockSpanner() {
        st.push(new int[]{-1,-1});
    }
    
    public int next(int price) {

        while(st.peek()[0] != -1 && st.peek()[1] <= price){
            st.pop();
        }

        int dayBefore = currentDay - st.peek()[0] ;
        st.push(new int[]{currentDay,price});  
        currentDay++; 

        return dayBefore;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */