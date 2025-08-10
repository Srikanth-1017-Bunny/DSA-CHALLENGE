class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=']'){
                st.push(c);
            }else{
                StringBuilder sb=new StringBuilder();
                while(st.size()>0 && st.peek()!='['){
                    sb.insert(0,st.pop());
                } 
                String toRepeat=sb.toString();
                st.pop(); 
                sb=new StringBuilder();
                while(st.size()>0 && st.peek()>='0' && st.peek()<='9'){
                    sb.insert(0,st.pop());
                }
                int count=Integer.parseInt(sb.toString());
                while(count-- >0){
                    for(int j=0;j<toRepeat.length();j++){
                        char ch=toRepeat.charAt(j);
                        st.push(ch);
                    }
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(st.size()>0){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}