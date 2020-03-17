public class deleteDuplication(ListNode pHead){
    if(pHead == null){
       return null;
    }
    ListNode tmp = new ListNode(-1);
    ListNode cur = pHead;
    ListNode node = temp;
    while(cur != null){
        if(cur.next != null && cur.val == cur.next.val ){
            while(cur.next != null && cur.val == cur.next.val){
                cur = cur.next;
            }
            cur = cur.next;
        } else {
            tmp.next = cur;
            cur = cur.next;
            tmp = tmp.next;
        }
    }
    tmp.next = null;
    return node.next;
}