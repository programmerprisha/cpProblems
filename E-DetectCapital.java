class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int track = 0; 
        boolean firstLetter = false; 

        if(Character.isUpperCase(word.charAt(0)) == true){
            firstLetter = true;
            track++;
        }

        for(int i = 1; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)) == true){
                track++;
            }
        }

        if(track == word.length() && firstLetter == true){
            return true;
        }
        if(firstLetter == true && track == 1){
            return true;
        }
        if(firstLetter == false && track == 0){
            return true;
        }

        return false;
    }
}
