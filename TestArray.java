import java.util.Arrays;

public class  TestArray{
    public static void main(String[] args) {
        int[] array = {2,2,2,2,2,2,2,2,2,2,2};
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
         newArray[i] =  getNewArray(i,array);
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static int getNewArray(int index ,int[] array ){
        int ret = 1;
        for (int i = 0; i < array.length; i++) {
            if(index == i){
                continue;
            }
            ret *= array[i];
        }
        return ret;
    }
}