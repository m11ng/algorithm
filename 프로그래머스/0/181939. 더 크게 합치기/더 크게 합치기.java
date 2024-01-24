class Solution {
    public int solution(int a, int b) {
        int answer = 0;
// 먼저 String 으로 변환
        String aaString = String.valueOf(a);
        String bbString = String.valueOf(b);
        
        // 문자열 값
        String abString = ""+aaString+bbString;
        String baString = ""+bbString+aaString;
        
        // 다시 숫자로 변환
        int ab = Integer.valueOf(abString);
        int ba = Integer.valueOf(baString);
        
        if(ab > ba) {
            answer = ab;
        }else { 
            answer = ba;
        }
        return answer;
    }
}