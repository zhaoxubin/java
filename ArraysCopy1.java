public class ArraysCopy1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] rec = arrayCopy(array);
        System.out.println("\n");
        System.out.print("¿½±´ºó:");
        for (int x: rec) {
            System.out.print(+x);
        }
    }
    public static int[] arrayCopy(int[] array){
        int[] rec = new int[array.length];
        System.out.print("¿½±´Ç°:");
        for (int x:rec) {
            System.out.print(x);
        }
        for (int i = 0; i <array.length ; i++) {
            rec[i] = array[i];
        }
        return rec;
    }
}