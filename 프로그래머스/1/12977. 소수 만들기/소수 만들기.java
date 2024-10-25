import java.util.*;
class Solution {
    Set <Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    public int solution(int[] nums) {
        int answer = 0;

        dfs (0,0,0,nums);
        System.out.print(set);
        
        for (Integer i : list) {
            boolean sosu =true;
            for (int j= 2; j<i; j++) {
                if (i%j ==0) {
                    sosu = false;
                }
            }
            if (sosu) {
                answer+=1;
            }
            
        }
        
        return answer;
    }
    
    public void dfs (int sum, int index, int depth, int[] nums) {
        if (depth ==3){
            // set.add(sum);
            list.add(sum);
            return;
        }
        
        
        for (int i=index; i<nums.length; i++) {
            dfs(sum+nums[i],i+1, depth+1, nums);
        }
    }
}