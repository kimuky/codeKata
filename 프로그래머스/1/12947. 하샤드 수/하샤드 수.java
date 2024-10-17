class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String strX = String.valueOf(x);
        String[] strXArr = strX.split("");
        int sum = 0;
        for (String str : strXArr) {
            sum += Integer.parseInt(str);
        }
        
        if (x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}