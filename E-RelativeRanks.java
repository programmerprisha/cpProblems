class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int[] original = Arrays.copyOf(score, score.length);

        // intentionally did selection sort :)
        for(int i = 0; i < score.length; i++){
            int minIndex = i; 

            for(int k = i+1; k < score.length; k++){
                if(score[k] > score[minIndex]){
                    minIndex = k; 
                }
            }

            int temp = score[i];
            score[i] = score[minIndex];
            score[minIndex] = temp;
        }

        System.out.println(Arrays.toString(score));

        HashMap<Integer, Integer> ranks = new HashMap<Integer, Integer>(); 

        int track = 0; 
        for(int j = 0; j < score.length; j++){
            ranks.put(score[j], track);
            track++;
        }

        for(int x = 0; x < original.length; x++){
            int rank = ranks.get(original[x]);
            if(rank == 0){
                result[x] = "Gold Medal";
            }
            else if(rank == 1){
                result[x] = "Silver Medal";
            }
            else if(rank == 2){
                result[x] = "Bronze Medal";
            }
            else {
                result[x] = String.valueOf(rank + 1);
            }
        }

        return result;
        
    }
}
