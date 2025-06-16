class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int amountFives = 0; 
        int amountTens = 0; 
        int temp = 0; 

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                amountFives++;
            }
            else if(bills[i] == 10){
                if(amountFives >= 1){
                    amountFives--;
                    amountTens++;
                }
                else{
                    return false;
                }
            }
            else{
                if(amountFives >= 1 && amountTens >= 1){
                    amountFives--;
                    amountTens--;
                }
                else if(amountFives >= 3){
                    amountFives = amountFives -3;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}
