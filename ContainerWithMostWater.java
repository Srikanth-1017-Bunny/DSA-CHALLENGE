class Solution {
    public int maxArea(int[] height) {

        int i=0;
        int j=height.length-1;
        int mx=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int area=h*w;
            mx=Math.max(area,mx);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
return mx;
    }
}