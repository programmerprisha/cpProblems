class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10 == 0 && x!=0)){
            return false;
        }

        int track = 0; 
        while(x>track){
            track = track * 10 + x%10; 
            System.out.println("TRACK * 10 " + (track *10)+ " and x%10 " + (x%10));
            System.out.println(track);
            x/=10; 
        }

        if(x == track || track/10 == x)
            return true; 
        else
            return false; 
    }
}
