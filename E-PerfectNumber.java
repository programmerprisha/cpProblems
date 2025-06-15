class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int count = 0; 
        int track = 1; 

        while(track < num){
            if(num % track == 0){
                count+= track;
            }
            track++;
        }

        return num == count;
    }
}
