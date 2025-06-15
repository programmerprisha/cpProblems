class WordPattern {
    public boolean wordPattern(String pattern, String s) {
         HashMap<Character, String> match = new HashMap<>();
         String[] words = s.split(" ");

         if(words.length != pattern.length()){
            return false;
         }

        for(int i = 0; i < pattern.length(); i++){
            if(match.containsKey(pattern.charAt(i)) == false && match.containsValue(words[i]) == false){
                match.put(pattern.charAt(i), words[i]);
            }
            else if(match.containsKey(pattern.charAt(i)) && words[i].equals(match.get(pattern.charAt(i)))){
                continue;
            }

            else{
                return false;
            }
        }

        return true;
    }
}
