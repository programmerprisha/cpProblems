class RomanToInteger {
    public int romanToInt(String s) {
        int total = 0; 
        int num = 0; 

        for(int i = s.length()-1; i>=0; i--){
            char character = s.charAt(i);
            if(character == 'I'){
                num = 1; 
            }
            else if(character == 'V'){
                num = 5; 
            }
            else if(character == 'X'){
                num = 10; 
            }
            else if(character == 'L'){
                num = 50; 
            }
            else if(character == 'C'){
                num = 100; 
            }
            else if(character == 'D'){
                num = 500; 
            }
            else{
                num = 1000; 
            }

            if(4*num < total){
                total-=num; 
            }
            else{
                total+=num;
            }
        }

        return total; 
    }
}
