class DayOfTheYear {
    public int dayOfYear(String date) {
        String[] dateSplit = date.split("-");
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = Integer.parseInt(dateSplit[2]);
        int month = Integer.parseInt(dateSplit[1]);
        int year = Integer.parseInt(dateSplit[0]);

        int total = 0; 
        
        if(leapYearCheck(year) == true){
            months[1] = 29; 
        }

        for(int i = 0; i < month - 1; i++){
            total+=months[i];
        }

        total+=day;
        return total;
    }

    private static boolean leapYearCheck(int x){
        if((x%400 == 0) || (x%4 == 0 && x%100 != 0)){
            return true; 
        }
        return false; 
    }
}
