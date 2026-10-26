class StockSpanner {

    class DayPrice{
        int currDay;
        int currPrice;

        public DayPrice(int currDay , int currPrice ){
            this.currDay = currDay;
            this.currPrice = currPrice;
        }
    }

    Stack<DayPrice> st = new Stack<>();
    int currentDay = 0;

    public StockSpanner() {
        st.push(new DayPrice(-1,-1));
    }
    
    public int next(int price) {

        while(st.peek().currDay != -1 && st.peek().currPrice <= price){
            st.pop();
        }

        int dayBefore = currentDay - st.peek().currDay;
        st.push(new DayPrice(currentDay,price));  
        currentDay++; 

        return dayBefore;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */