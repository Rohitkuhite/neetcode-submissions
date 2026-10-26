class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(String st : strs)
        {
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String newSt = String.valueOf(arr);

            if(map.containsKey(newSt))
            {
                List<String> inner = map.get(newSt);
                inner.add(st);
                map.put(newSt,inner);
            }
            else{
                ArrayList<String> inner = new ArrayList<>();
                inner.add(st);
                map.put(newSt,inner);
            }
        }

        for(String s : map.keySet())
        {
            outer.add(map.get(s));
        }

        return outer;
    }
}
