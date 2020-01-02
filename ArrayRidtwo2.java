public class ArrayRidTwo2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] output = transform(array);
        print(array);
        System.out.println("\n");
        print(output);

    }
    public static int[] transform(int[] array){
        int[] ret = new int[array.length];
        for(int i=0;i<array.length;i++){
           ret[i]=array[i]*2;
        }
        return ret;
    }
    public static void print(int[] array){
        for (int x: array) {
            System.out.print(x+" ");
        }
    }
}