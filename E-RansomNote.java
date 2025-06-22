class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> letters = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(letters.containsKey(magazine.charAt(i)) == false){
                letters.put(magazine.charAt(i), 1);
            }
            else{
                letters.put(magazine.charAt(i), letters.get(magazine.charAt(i)) + 1);
            }
        }
        
        int count = 0; 
        for(int k = 0; k < ransomNote.length(); k++){
            char valueLetter = ransomNote.charAt(k);
            if (letters.containsKey(valueLetter) == false) {
                return false;
            }
            if (letters.get(valueLetter) == 1) {
                letters.remove(valueLetter);
                count++;
            } 
            else {
                letters.put(valueLetter, letters.get(valueLetter) - 1);
                count++;
            }
            
        }

        return ransomNote.length() == count;
    }
}
