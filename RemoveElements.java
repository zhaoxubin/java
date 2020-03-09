public ListNode removeElements(ListNode head, int val) {
   if(head == null){
       return null;
   }
   while(head != null && head.val == val){
       head = head.next;
   }
      ListNode pre = head;
      if(pre != null ){
          while(pre != null){
              if(pre.next.val == val){
                  pre.next = pre.next.next;
              } else {
                  pre = pre.next;
              }
          }
      }
      return head;
}