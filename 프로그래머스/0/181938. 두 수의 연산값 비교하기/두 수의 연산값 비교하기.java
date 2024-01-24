class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        // 삼항연산자 이용해보기
        answer = (Integer.valueOf(""+a+b)>(2*a*b)) ? Integer.valueOf(""+a+b) : (2*a*b);
        return answer;
    }
}