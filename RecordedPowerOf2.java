class Solution {
    public boolean reorderedPowerOf2(int n) {

        String number=sort(n);

        for(int i=0;i<31;i++){
            int currPower=1<<i;
            String sortedCurrPower=sort(currPower);
            if(sortedCurrPower.equals(number)){
                return true;
            }
            }
            return false;
    }
        

        String sort(int num){
            char[] arr=String.valueOf(num).toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
        
    
}