class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0; 
        HashMap<Integer, Character> jValues = new HashMap<>();
        for(int k = 0; k<jewels.length(); k++){
            jValues.put(k, jewels.charAt(k));
        }
        for(int i = 0; i< stones.length(); i++){
            if(jValues.containsValue(stones.charAt(i))){
                count++; 
            }
        }

        return count;
    }
}
