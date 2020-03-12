public ListNode FindKthToTail(ListNode head,int k){
    if(head == null){
        return null;
    }
    int size = size(head)；
    if(k <= 0 || k > size){
        return null;
    }
    int stemp = size -k;
    ListNode cur = head;
    for(int i = 0; i < stemp ; i++){
        cur = cur.next;
    }
    return cur;
}
public int size(ListNode head){
    int size = 0;
    for(ListNode cur = head; cur != null; cur = cur.next){
        size++;
    }
    return size;
}