import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        int flag = 0;
        for (int a : arr) {
            if (a%divisor == 0) {
                list.add(a);
                flag++;
            }    
        }
        Collections.sort(list);
        int listSize = list.size();
        int[] answer = new int[listSize];
        int count = 0;
        for (Integer i: list) {
            answer[count++] = Integer.valueOf(i);
        }
        if (flag == 0) {
            int[] temp = new int[1];
            temp[0]= -1;
            return temp;
        }
        
        
        return answer;
    }
}