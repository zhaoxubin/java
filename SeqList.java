class Animals{
    private String name;
    public Animals(String name) {
        this.name = name;
    }
}
public class SeqList<E> {
    private int size;
    private E[] data = (E[]) new Object[100];
   public void add(E elem){
       data[size] = elem;
       size++;
   }
    public E get(int index){
        return data[index];
    }

    public static void main(String[] args) {
//        SeqList seqList = new SeqList();
////        seqList.add("aaaa");
////        seqList.add("bbbb");
////        //String也是继承于Object
////        //向下转型
////        String str = (String)seqList.get(0);
        SeqList<String> seqList = new SeqList<>();
        seqList.add("aaaa");
        seqList.add("bbbb");
        String str = seqList.get(0);
        System.out.println(str);
        SeqList<Animals> animalsSeqList = new SeqList<>();
        animalsSeqList.add(new Animals("猫"));
        animalsSeqList.add(new Animals("狗"));
        Animals str1 = animalsSeqList.get(0);
        System.out.println(str1);
    }
}