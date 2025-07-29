class HeightChecker {
    public int heightChecker(int[] heights) {
        int ans = 0; 
        int[] given = new int[heights.length];

        System.arraycopy(heights, 0, given, 0, heights.length);

        Arrays.sort(heights);

        for(int k = 0; k < heights.length; k++){
            if(heights[k] != given[k]){
                ans++; 
            }
        }
        
        return ans; 
    }
}
