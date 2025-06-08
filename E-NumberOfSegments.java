class NumberOfSegments {
    public int countSegments(String s) {
        String trimWord = s.trim(); 
        if(trimWord.equals("")){
            return 0;
        }
        String[] words = trimWord.split("\\s+");
        return words.length;
    }
}
