class HammingDistance {
    public int hammingDistance(int x, int y) {
        int res = 0; 
        int calc = x ^ y; 
        while(calc != 0){
            if((calc & 1) == 1){
                res++;
            }
        calc = calc >> 1;
        }
        return res;
    }
}
