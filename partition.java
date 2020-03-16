public ListNode partition(ListNode pHead , int x ){
    if(pHead == null){
        return null;
    }
    if(head.next == null){
        return pHead; 
    }
    ListNode bigHead = new ListNode(-1);
    ListNode bigTail = bigHead;
    ListNode smallHead = new ListNode(-1);
    ListNode smallTail = smallHead;
    for(ListNode cur = pHead; cur != null;cur = cuer.next){
        if(cur.val < x){
            smallTail.next = new ListNode(cur.val);
            smallTail = smallTail.next;
        } else {
            bigTail.next = nwe ListNode(cur.val);
            bigTail = bigTail.next;
        }
    }
    smallTail.next = bigHead.next;
    return smallHead.next; 
}