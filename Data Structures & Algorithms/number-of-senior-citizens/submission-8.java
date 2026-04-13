class Solution {
    public int countSeniors(String[] details) {
        int sCount = 0;
        String age = "";
        
        for (int i = 0; i < details.length;i++){
            
            for(int j = 0; j < details[i].length();j++){
                age += details[i].charAt(11);
                age += details[i].charAt(12);
            
                if (Integer.parseInt(age) > 60){
                    sCount++;
                    age = "";
                    break;
                }
                else {
                    sCount += 0;
                    age="";
                    break;
                }
                
                
            }
        }
        return sCount;
    }
}

// sCount = 0
// loop oveer the string details array
// 	for every passenger picked its age
// 	compare if age >= 70
// 		count++

// return count