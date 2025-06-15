class HappyNumber {
    public boolean isHappy(int n) {
        int count = n;
        int track = 0; 
        
        if(count == 1 || count == 7){
            return true;
        }
        if (count < 10){
            return false;
        }


        while(n > 0){
            count = n % 10; 
            track += count * count;
            n = n/10;
        }

        if(track == 1){
            return true;
        }
        return isHappy(track); 
    }
}
