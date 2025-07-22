class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."};

        HashSet<String> uniqueWords = new HashSet<>();

        for(int i = 0; i < words.length; i++){
            String curr = "";
            for(int k = 0; k < words[i].length(); k++){
                char c = words[i].charAt(k);
                curr += code[c - 'a'];
            }
            uniqueWords.add(curr);
        }

        return uniqueWords.size();

    }
}
