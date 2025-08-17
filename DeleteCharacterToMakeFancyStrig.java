class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int fancyCount=1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);

            if(curr==prev){
                fancyCount++;
            }else{
                fancyCount=1;
            }
            if(fancyCount>2){
                continue;
            }

            sb.append(curr);
        }
       return  sb.toString();
    }
}