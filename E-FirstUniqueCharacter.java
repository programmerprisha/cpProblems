class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> letters = new ArrayList<>(); 

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) == false && letters.contains(s.charAt(i)) == false){
                map.put(s.charAt(i), i);
                letters.add(s.charAt(i));
            }
            else{
                map.remove(s.charAt(i));
            }
        }
           if(map.size() == 0)
                return -1; 
           
           else{
                int minIndex = s.length()-1; 
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if(entry.getValue() < minIndex){
                        minIndex = entry.getValue();
                    }
                }
                return minIndex;
           }
           
    }
}
