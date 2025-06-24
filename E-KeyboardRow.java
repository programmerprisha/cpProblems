class KeyboardRow {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        int first = 0; 
        int second = 0; 
        int third = 0; 

        ArrayList<String> result = new ArrayList<>(); 
        for(int i = 0; i < words.length; i++){
            String lower = words[i].toLowerCase();
            for(int k = 0; k < lower.length(); k++){
                char c = lower.charAt(k);
                if(row1.contains(String.valueOf(c))){
                    first++; 
                } 
                else if(row2.contains(String.valueOf(c))){
                    second++;
                }
                else{
                    third++;
                }
            }
            if(first == lower.length() || second == lower.length() || third == lower.length()){
                result.add(words[i]);
            }
            first = 0; 
            second = 0; 
            third = 0; 
        }

        String finalResult[] = result.toArray(new String[0]);

        return finalResult;
        
    }
}
