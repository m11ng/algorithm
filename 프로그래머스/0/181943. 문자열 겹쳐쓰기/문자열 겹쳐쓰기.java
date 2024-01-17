class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = ""; // 새로 담을 그릇
    
        // 다른 사람 풀이 봄.. 보고 배우자
        // subString 이용
        String str1 = my_string.substring(0,s);
        String str2 = my_string.substring(s + overwrite_string.length());
        answer = str1 + overwrite_string+ str2;

        return answer;
        
    }
}