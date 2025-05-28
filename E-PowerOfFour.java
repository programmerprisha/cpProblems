class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        double num = 0; 
        int track = 0; 

        while(num < Integer.MAX_VALUE){
            if(Math.pow(4, track) == n)
                return true; 
            else{
                track++; 
                num = Math.pow(4, track);
            }
        }
        return false; 
    }
}
