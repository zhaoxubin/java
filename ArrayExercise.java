public class ArrayExercise {
    public static void main(String[] args) {
        int[] array1=fuc();
        for (int x : array1) {
            System.out.print(x+" ");
        }
    }
    public static int[] fuc(){
        int[] array2={1,2,3,4,5};
        return array2;
    }
}