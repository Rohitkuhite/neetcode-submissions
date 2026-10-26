class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
     HashMap<Integer , Integer> hashMap = new HashMap<Integer , Integer>();

     for( int n : nums) {
        if(hashMap.get(n) == null){
            hashMap.put(n,1);
        }else{
            hashMap.put(n,(int)hashMap.get(n)+1);
        }
     }

     for(Map.Entry<Integer , Integer> entry : hashMap.entrySet()){
       if(entry.getValue() > 1){
        ans = true;
       }
     }
return ans;
    }
}