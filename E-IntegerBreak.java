class IntegerBreak {
    public int integerBreak(int n) {
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }

        int threes = n/3; 
        int remaining = n % 3; 

        if (remaining == 1){
            return (int) Math.pow(3, threes-1) * 4;
        }
        else if(remaining == 0){
            return (int) Math.pow(3, threes);
        }
        else{
            return (int) Math.pow(3, threes) * 2;
        }
    }
}
