import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number];
        
        for (int i= 0; i<arr.length; i++) {
            arr[i] = i+1;
        }

        
        
        for (int k= 0; k<arr.length; k++) {
        int count = 0;
            for (int i =1; i<=Math.sqrt(arr[k]); i++){
                if(arr[k]%i == 0) {
                     count +=1;
                    if (arr[k] / i != i) {
                        count+=1;
                    }
                }
            }
            arr[k] = count;
        }
        
        for (int i : arr) {
            if (i > limit) {
                answer += power;
            } else {
                answer += i;
            }
        }
        return answer;
        
        }
        
        
    }
