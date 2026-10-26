class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<Character>();

        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch != ']'){
                st.push(ch);
            }else{
                // retriving the strings after '['
                  StringBuilder sb = new StringBuilder();
                  while(st.size()>0 && st.peek() != '['){
                    sb.insert(0,st.pop());
                  }

                  String toRepeat = sb.toString();
                  st.pop(); // to pop '['

                // retriving the digits before '['
                   
                   sb = new StringBuilder();
                   while(st.size() > 0 && st.peek() >= '0' && st.peek() <='9'){
                    sb.insert(0,st.pop());
                   }

                   int count = Integer.parseInt(sb.toString());

                // push the string reapeating time

                while(count != 0){
                    for(char c : toRepeat.toCharArray()){
                        st.push(c);
                    }
                    count--;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while(st.size() != 0){
            ans.insert(0 , st.pop());
        }

        return ans.toString();
    }
}