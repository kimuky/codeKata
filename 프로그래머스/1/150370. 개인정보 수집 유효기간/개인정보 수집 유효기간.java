import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        String[] todayArr = today.split("\\.");
        int todayY = Integer.parseInt(todayArr[0]);
        int todayM = Integer.parseInt(todayArr[1]);
        int todayD = Integer.parseInt(todayArr[2]);
        
        // 약관 정리
        for (String seperate : terms) {
            String[] sortTerm = seperate.split(" ");
            map.put(sortTerm[0], Integer.parseInt(sortTerm[1]));
        }
        
        int index = 1;
        for (String privacie : privacies) {
            String[] divide = privacie.split(" ");
            
            String date = divide[0];
            String term = divide[1];
            
            String[] dateSep = date.split("\\.");
            int priY = Integer.parseInt(dateSep[0]);
            int priM = Integer.parseInt(dateSep[1]);
            int priD = Integer.parseInt(dateSep[2]);
            
            int endY = priY;
            int endM = priM + map.get(term);
            int endD = priD -1;
            if (endD <1) {
                endM -=1;
                endD = 28;
            }
            if (endM <1) {
                endY -=1;
            }
            while (endM > 12) {
                endM-=12;
                endY+=1;
            }
            System.out.println(endY+" "+endM+" "+endD);
            if (endY < todayY || (endY == todayY) && (endM < todayM) ||
                (endY == todayY) && (endM == todayM) && (endD < todayD) ) {
                list.add(index);
            }
            index++;
        }
        
        
        int[] answer = new int[list.size()];
        int inx = 0;
        for (Integer i : list) {
            answer[inx++] = i;
        }
        
        
        return answer;
    }
}