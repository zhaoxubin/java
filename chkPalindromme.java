public boolean chkPalindromme(ListNode A){
    int size = size(A);
    int steps = size/2;
    ListNode B = A;
    for(int i = 0; i < steps; i++){
        B = B.next;
    }
    ListNode prev = null;
    ListNode cur = B;
    while(cur != null){
        ListNode next = cur.next;
        if(next = null){
            B = cur; 
        }
        cur.next = pre;
        pre = cur;
        cur = next;
    }
}