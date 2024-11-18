import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] reportedArr = new int[id_list.length];
        
        Set<String> reportSet = new TreeSet<>(Arrays.asList(report));
        
        for (String reportString : reportSet) {
            String[] reportTwo = reportString.split(" ");

            String reporter = reportTwo[0];
            String reported = reportTwo[1];
               
            if(Arrays.asList(id_list).indexOf(reported)>-1) {
                reportedArr[Arrays.asList(id_list).indexOf(reported)] +=1;
            }    
        }
        
        for (String reportString : reportSet) {
            String[] reportTwo = reportString.split(" ");

            String reporter = reportTwo[0];
            String reported = reportTwo[1];
               
        
            if (reportedArr[Arrays.asList(id_list).indexOf(reported)] >=k) {
                answer[Arrays.asList(id_list).indexOf(reporter)] +=1;
            }   
        }
        
        
        return answer;
    }
}