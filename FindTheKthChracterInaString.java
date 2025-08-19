class Solution {
    public char kthCharacter(int k) {
        int toAdd=0;
        while(k>1){
            k=k-closestTwo(k-1);
            toAdd++;
        }

        return (char)('a'+toAdd);
        
    }

    int closestTwo(int num){
    int ans=1;
        while(ans<<1<=num){
        ans=ans<<1;
    }
    return ans;
    }
}