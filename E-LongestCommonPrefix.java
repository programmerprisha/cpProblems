class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String word = "";
        int count = 0; 
        for(int i = 0; i<strs[0].length(); i++){
            word+=strs[0].substring(i, i+1);; 
            for(int k =0; k<strs.length; k++){
                if(strs[k].startsWith(word))
                    count++; 
            }

            if(count == strs.length){
                count = 0; 
                prefix = word; 
            }
            else{
                return prefix;
            }
        }
        return prefix;
    }
}
