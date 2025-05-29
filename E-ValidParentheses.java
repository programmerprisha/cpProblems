class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>(); 
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                brackets.push(s.charAt(i));
            }
            else{
                if(brackets.isEmpty() == true){
                    return false;
                }

                char first = brackets.pop(); 
                if((s.charAt(i) == ')' && first!= '(') || (s.charAt(i) == '}' && first!= '{') || (s.charAt(i) == ']' && first!= '[')){
                    return false; 
                }
     
            }
        }
            return brackets.isEmpty();
            
    }
    
}
