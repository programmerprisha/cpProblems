class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[^a-zA-Z]+");
        HashMap<String, Integer> numWords = new HashMap<String, Integer>(); 
        ArrayList<String> ban = new ArrayList<>(); 

        for(String a: banned){
            ban.add(a);
        }

        for(int i = 0; i < words.length; i++){
            String word = words[i].replaceAll("[^a-z]", "");
            if(ban.contains(word) == false && numWords.containsKey(word)){
                int count = numWords.get(word);
                numWords.put(word, count + 1);
            }
            else if(ban.contains(word) == false && numWords.containsKey(word) == false){
                numWords.put(word, 1);
            }
            else{
                continue;
            }
        }

        System.out.println(numWords);

        int max = 0; 
        String magicWord = "";
        Set<Map.Entry<String, Integer>> entries = numWords.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int value = entry.getValue();
            if(value > max){
                max = value; 
                magicWord = entry.getKey(); 
            }
        }

        return magicWord;
    }
}
