class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++){
            numbers.put(nums[i], numbers.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: numbers.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey(); 
            }
        }
        return -1; 
    }
}
