class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int totals=0;                              
        for(int i=0; i<numbers.length; i++) {   
            totals+=numbers[i];                    
        }
        answer=(double) totals/numbers.length;     
        return answer;
    }
}
