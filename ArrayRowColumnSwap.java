public class ArrayRowColumnSwap {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("行列互调前");
        printArray(array);
        int[][] array2 = new int[array.length][array.length];
        for(int i = 0;i < array.length;i++){
            for(int j = 0; j < array[i].length;j++ ){
                array2[i][j] = array[j][i];
            }
        }
        System.out.println("行列互调后");
        printArray(array2);
        }
        public static void printArray(int[][] arr){
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j <arr.length ; j++) {
                    System.out.println(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
}
