public class ArrayFind {
    public static void main(String[] args) {
        int[] array = {23, 14, 65, 34, 87, 47, 38, 26, 35, 102, 59};
        System.out.println(find(array, 26));
    }

    public static int find(int[] arr, int findnum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findnum) {
                return i;

            }

        }
        return -1;
    }
}