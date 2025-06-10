class FindSmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        char min = '~';
        boolean state = false; 
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target && letters[i] < min){
                min = letters[i];
                state = true;
            }
        }

        if(state == false){
            return letters[0];
        }
        else{
            return min;
        }
    }
}
