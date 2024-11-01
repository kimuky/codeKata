class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        int inx = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (String str : sArr) {
            if (str.charAt(0) == '-') {
                iArr[inx] = Integer.parseInt(str);
            } else {
                iArr[inx] = Integer.parseInt(str);
            }
            max = max > iArr[inx] ? max : iArr[inx]; 
            min = min < iArr[inx] ? min : iArr[inx]; 
            
            inx++;
        }
        answer = min + " "+max;
        
        return answer;
    }
}