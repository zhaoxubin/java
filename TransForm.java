public class TransForm {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        transForm(array);
        for (int x : array) {
            System.out.println(x);
        }
    }
    public static int[] transForm(int[ ] array){
        for (int i = 0; i <=array.length/2 ; i++) {
            for (int j = array.length-1; j>=array.length/2 ; j--) {
                if(array[i]%2!=0&&array[j]%2==0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;

    }
}