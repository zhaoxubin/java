public class TransForm2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        transForm(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
    public static int[] transForm(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left<right){
            while(left<right&&array[left]%2==0){
                left++;
            }
            while(left<right&&array[right]%2!=0){
                right--;
            }
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        return array;
    }
}

