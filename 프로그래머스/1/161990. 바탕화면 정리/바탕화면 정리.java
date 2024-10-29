import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        List<int[]> list = new ArrayList<>();
        
        
        for (int i= 0; i<wallpaper.length; i++) {
            
            String[] paperArr = wallpaper[i].split("");
            for (int j= 0; j<paperArr.length; j++) {
                
                if (paperArr[j].equals("#")) {
                    int[] tempArr = new int[]{i,j};
                    list.add(tempArr); 
                }
            }
        }
        int minX = 51;        
        int maxX = 0;        
        int minY = 51;        
        int maxY = 0;       
        
        for (int[] a : list) {
            minY = a[0] < minY ? a[0]: minY;
            maxY = a[0] > maxY ? a[0]: maxY;
            minX = a[1] < minX ? a[1]: minX;
            maxX = a[1] > maxX ? a[1]: maxX;
        }
        
        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY +1;
        answer[3] = maxX+1;
        
        return answer;
    }
}