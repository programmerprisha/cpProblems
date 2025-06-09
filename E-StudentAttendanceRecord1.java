class StudentAttendanceRecord1 {
    public boolean checkRecord(String s) {
        int countL= 0; 
        int countA = 0; 
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                countL = 0; 
                countA++; 
                if(countA == 2){
                    return false;
                }
            }
            else if(s.charAt(i) == 'L'){
                countL++; 
                if(countL == 3){
                  return false; 
                }
            }
            else{
                countL = 0; 
            }
        }
        return true;
    }
}
