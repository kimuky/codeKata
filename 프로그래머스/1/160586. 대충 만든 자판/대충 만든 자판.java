class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int tt= 0;
        for (String target : targets) {
            String[] targetArr = target.split("");
            
            int count = 0;
            for (String str : targetArr) {
                
                int index = 102;
                for (String key : keymap) {
                    if (key.contains(str)){
                        index = key.indexOf(str) < index ? key.indexOf(str) : index;
                    }
                }
                if (index==102) {
                    count = -1;
                    break;
                } else {
                    count += index+1;
                }
            }
            answer[tt++] = count;
        }
        
        return answer;
    }
}