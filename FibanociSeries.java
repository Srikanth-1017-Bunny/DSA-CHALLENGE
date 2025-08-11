class Solution {
    public int fib(int n) {
        if(n==0|| n==1){
            return n;
        }
        int nm1=fib(n-1);
        int nm2=fib(n-2);

        return nm1+nm2;
        
    }
}