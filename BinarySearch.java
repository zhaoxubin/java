public class BinarySearch{
    public static void main(String[] args) {
        int[] array = { 23, 14, 65, 34, 87, 47, 38, 26, 35, 102, 59};
        System.out.println(binary(array,102));
    }
    public static int binary(int[] array,int findnumber ){
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while(left<right) {
             mid = (left+right)/2;
            if (findnumber > array[mid]) {
                left = mid+1;
            } else if (findnumber<array[mid]){
                right = mid-1;
            } else {
                break;
            }
        }
        return mid;
    }
}