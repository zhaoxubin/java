public ListNode getIntersectionNode(ListNode headA, ListNode headB){
    int size1 = size(headA);
    int size2 = size(headB);
    if(size1 > size2){
        int offset = size1-size2;
        for(int i = 0; i < offset; i++){
            headA = headA.next;
        }
    } else {
        int offset = size2 - size1;
        for(int i = 0; i < offset; i++){
            headB = headB.next;
        }
    }
    while(headA != null && headB != null){
        if(headA == headB){
        return headA;
        }
        headA = headA.next;
        headB = headB.next;
    }
    return null;
}