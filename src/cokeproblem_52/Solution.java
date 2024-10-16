package cokeproblem_52;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int emptyBottle;
        int remainBottle;
        // test
        while(true) {
            if (n< a){
                break;
            }

            emptyBottle = b*(n/a);
            remainBottle = n%a;
            answer += emptyBottle;
            n = emptyBottle + remainBottle;
        }
        return answer;
    }
}