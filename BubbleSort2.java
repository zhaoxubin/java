public class BubbleSort2{
    public static void main(String[] args) {
        int[] array = {12,1,34,2,56,45,31,90,38,59,10,34,68};
        int[]rec = bubbleSort(array);
        for (int x : rec) {
            System.out.println(x);
        }
    }
    public static int[] bubbleSort(int[] array1){
        for (int bound = 0; bound < array1.length; bound++) {
            for (int cur = array1.length-1;cur >bound;cur--){
                if( array1[cur-1]>array1[cur]){
                    int  temp = array1[cur-1];
                    array1[cur-1] = array1[cur];
                    array1[cur] = temp;
                }
            }

        }
return array1;
    }
}