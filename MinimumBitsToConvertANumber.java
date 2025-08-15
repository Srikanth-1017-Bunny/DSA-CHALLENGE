class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int bitVal=start^goal;
        while(bitVal>0){
            if((bitVal&1)!=0){
                count++;
            }
            bitVal=bitVal>>1;
        }
        return count;
        
    }
}