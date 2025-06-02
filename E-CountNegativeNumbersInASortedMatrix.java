class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int neg = 0; 
        for(int i = 0; i< grid.length; i++){
            for(int k = 0; k < grid[0].length; k++){
                if(grid[i][k] < 0){
                    neg++; 
                }
            }
        }
        return neg;
    }
}
