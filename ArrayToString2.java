public class ArrayToString2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Êä³ö×Ö·û´®array");
        System.out.println(ArraytoString(array));
    }
    public static String ArraytoString(int[] array){
        String ret="[";
        for (int i = 0; i <array.length ; i++) {
            ret+=array[i];
            if(i<array.length-1){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }
}