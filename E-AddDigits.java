class Solution {
    public int addDigits(int num) {
        // my way 
        
        int count = num; 

        while(count > 9){
            String numValue = String.valueOf(count);
            count = 0; 
            for(int i = 0; i< numValue.length(); i++){
                count+= Integer.parseInt(numValue.substring(i, i+1));
            }
            if(count < 10){
                return count; 
            }
        }
        return num;


        // most optimal way! 
        if (num == 0) {
            return 0;
        }
        else if (num % 9 != 0) {
            return num % 9; 
        }
        else {
            return 9;
        }
    }

}
