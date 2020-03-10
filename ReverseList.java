public ListNode ReverseList(ListNode head){
    ListNode pre = null;
    LIstNode newHead = null;
    LIstNode cur = head;
    while(cur != null){
        ListNode curNext = cur.next;
        if(curNext == null){
            newHead = cur;
        }
        cur.next = pre;
        pre = cur;
        cur = cur.next;
    }
      return newHead;
}