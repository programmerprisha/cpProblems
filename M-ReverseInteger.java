class ReverseInteger {
    public int reverse(int x) {
        int num = x; 
        int reverse = 0;

        if(num < Integer.MIN_VALUE || num > Integer.MAX_VALUE){
            return 0;
        }

         if(num < 0)
            num = -num;

        while(num != 0){
            if(reverse < Integer.MIN_VALUE / 10|| reverse > Integer.MAX_VALUE / 10){
                return 0;
            }
            int digit = num % 10; 
            reverse = reverse *10 + num % 10;
            num = num/10;
        }

        if(x < 0)
            reverse = -reverse;

         return reverse;
    }
}
