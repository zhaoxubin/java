public class SeqList1<E> {
    private  int size = 0;
    E[] data = (E[])new Object[100];
    public void add(E elem){
        data[size] = elem;
        size++;
    }
    public E get(int index){
        return data[index];
    }

    public static void main(String[] args) {
        SeqList1<Integer> integerSeqList1 = new SeqList1<>();
       // integerSeqList1.add(1);
        //上面的int=>Integer称为装箱
        integerSeqList1.add(new Integer(1) );
      //  Integer num = Integer.valueOf(1); 这样也称为装箱
      //  integerSeqList1.add(num);
        Integer num = 10; //将int 赋给 Integer  自动装箱
        integerSeqList1.add(new Integer(2));
        integerSeqList1.add(new Integer(3));
        System.out.println(integerSeqList1.get(0));
        //把Integer=>int称为拆箱
        num = integerSeqList1.get(2);
      //  int result = num.intValue();  手动拆箱
        int result = num;//自动拆箱
    }
}