class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        // not most optimal solution -- should have squareroot and then do the problem 

        HashMap<Integer, Integer> dimensions = new HashMap<Integer, Integer>(); 

        for(int i = 1; i <= area; i++){
            if(area % i == 0 && i >= (area/i)){
                dimensions.put(i, area/i);
            }
        }

        int bestLength = 0; 
        int bestHeight = 0; 
        int diff = Integer.MAX_VALUE; 

        for(Map.Entry<Integer, Integer> entry: dimensions.entrySet()){
            int x = entry.getKey(); 
            int y = entry.getValue(); 

            if(x - y < diff){
                bestLength = x;
                bestHeight = y; 
                diff = x - y; 
            }
        }

        int arr[] = {bestLength, bestHeight}; 
        return arr; 
    }
}
