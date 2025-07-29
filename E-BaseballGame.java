class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> result = new Stack<>();
        int total = 0; 

        for(int i = 0; i < operations.length; i++){
            String cur = operations[i];
            if(cur.equals("+")){
                int prev = result.pop(); 
                int prevprev = result.peek(); 
                result.push(prev);
                result.push(prev + prevprev);
            }
            else if(cur.equals("D")){
                int prev = result.peek(); 
                result.push(prev * 2);
            }
            else if(cur.equals("C")){
                result.pop(); 
            }
            else{
                result.push(Integer.valueOf(cur));
            }
        }

        System.out.println(result);

        for(int x : result){
            total += x; 
        }

        return total; 
    }
}
