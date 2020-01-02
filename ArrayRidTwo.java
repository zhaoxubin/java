public class ArrayRidTwo {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        arrayRidTwo(array);
        print(array);
    }
    public static void arrayRidTwo(int[] array){
        for (int i = 0; i <array.length ; i++) {
            array[i]*=2;
        }
    }
    public static void print(int[] array){
        for (int x: array) {
            System.out.print(x+" ");
        }
    }
}