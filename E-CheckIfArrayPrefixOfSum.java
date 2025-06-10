class CheckIfArrayPrefixOfSum {
    public boolean isPrefixString(String s, String[] words) {
        String blank = "";
        for(int i = 0; i < words.length; i++){
            blank += words[i];
            if(blank.equals(s)){
                return true;
            }
        }
        return false; 
    }
}
