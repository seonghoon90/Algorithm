class Solution {
    public String solution(int num) {
        String answer = "";
        
        if (num==0 || num % 2==0) {
            return "Even";
        } 
        else { return "Odd";}
    }
}