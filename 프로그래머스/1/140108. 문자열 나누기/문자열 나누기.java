class Solution {
    public int solution(String s) {
        int answer = 0;
        String firStr = "";
        int firCount = 0;
        int anotherCount = 0;
        
        String[] sArr = s.split("");
        
        for (String str : sArr) {
            if (firStr.isEmpty()){
                firStr = str;   
            } 
            
            if (firStr.equals(str)) {
                firCount++;
            } else  {
                anotherCount++;
                
                if (firCount == anotherCount ){
                    answer +=1;
                    firStr = "";
                    firCount= 0;
                    anotherCount = 0;
                }
            }
        }
        if (firCount >0 || anotherCount>0) {
            answer +=1;
        }
        
        return answer;
    }
}