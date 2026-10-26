class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        HashMap<Integer,Integer> hashMap = new  HashMap<Integer,Integer>();
        int k = 0;
        for( int n :  nums){
            if(hashMap.get(n) == null){
                hashMap.put(n , 1);
            }else{
                hashMap.put(n,(int)hashMap.get(n) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if((int)entry.getValue() > size/2) {
                k = entry.getKey();
            }
        }
return k;
    }
}