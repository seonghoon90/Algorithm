class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double result=(double)num1/num2;
        result*=1000;
        
        return (int)result;
    }
}