class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> letters = new HashMap<>();
        //boolean state = true;

        for(int i = 0; i < s.length(); i++){
            if(letters.containsKey(s.charAt(i)) == false && letters.containsValue(t.charAt(i)) == false){
                letters.put(s.charAt(i), t.charAt(i));
            }
            else if(letters.containsKey(s.charAt(i)) && t.charAt(i) == letters.get(s.charAt(i))){
                continue;
            }

            else{
                return false;
            }
        }

        return true;
    }
}
