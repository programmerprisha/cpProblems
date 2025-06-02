class Sqrt(x) {
    public int mySqrt(int x) {
        int low = 1; 
        int high = x; 
        int mid = 0; 
        int ans = 0; 

        if(x == 0 || x == 1){
            return x; 
        }
    

        while(low <= high){
            mid = low + (high - low)/2;
            if((long) mid * mid == x){
                return mid; 
            }

            if((long) mid * mid < x){
                low = mid + 1; 
                ans = mid; 
            }
            else{
                high = mid -1; 
            }
        }

        return ans; 

        }
    }
