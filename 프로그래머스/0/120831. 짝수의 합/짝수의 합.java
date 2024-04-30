class Solution {
    public int solution(int n) {
        int answer = 0;
        
       int result = 0;
        for(int i = 2; i <= n; i+=2) {
            if(i % 2 == 0) {
               result += i;
            } 
        }
        return result;
    }
}