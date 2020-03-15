public ListNode mergeTwoLists(ListNode L1 , ListNode L2){
    ListNode node = new ListNode(-1);
    ListNode temp = node;
    while(L1 != null && L2 != null){
        if(L1.val < L2.val){
            temp.next = L1;
            L1 = L1.next;
            Temp = Temp.next;
        } else {
            Temp.next = L2;
            L2 = L2.next;
            Temp = Temp.next; 
        }
    }
    if(L1 != null){
        Temp.next = L1;
    }
    if(L2 != null){
        Temp.next = L2; 
    }
    retrun node.next;
}