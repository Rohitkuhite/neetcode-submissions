class Solution {
    public String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String arr[] = path.split("/");

        for(int i = 0 ; i < arr.length ; i++){
            String curr = arr[i];

            if(curr != " " && curr.equals("..") == false && curr.equals(".") == false && curr != ""){
                st.push(curr);
            }else if(curr.equals("..") && !st.isEmpty()){
                st.pop();
            }
        }

        if(st.size() == 0){
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
            sb.insert(0,"/");
        }

        return sb.toString();
        
    }
}