class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int Steps=count-n;

        if(Steps==0){
            return head.next;
        }
        temp=head;
        for(int i=1;i<Steps;i++)
        temp=temp.next;

        temp.next=temp.next.next;
        

        return head;
    }
}