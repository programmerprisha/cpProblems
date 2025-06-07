class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int count = 0; 
        char letters[] = s.toCharArray(); 

        for(int i = 0; i< t.length(); i++){
            if(count >= s.length()){
                break;
            }
            if(t.charAt(i) == letters[count]){
                count++; 
            }
        }

        if(count == s.length()){
            return true;
        }

        return false; 
        
    }
}
