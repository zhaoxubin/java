
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {12,3,65,45,98,2,35,87,94,47,68,3,36};
        System.out.println("ÅÅÐòÇ°");
        printArray(array);
        quickSort(array,0,array.length-1);
        System.out.println("ÅÅÐòºó");
        printArray(array);
    }
    private static void quickSort(int[] arr,int lowIndex,int highIndex){
        int low = lowIndex;
        int hig = highIndex;
        int mid;
        if(highIndex > lowIndex){
            mid = arr[(lowIndex+highIndex)/2];
            while(low <= hig){
                while((low < highIndex)&&(arr[low] < mid))
                    ++low;

                while((hig > lowIndex)&&(arr[hig] > mid))
                    --hig;

                if(low <= hig){
                    swap(arr,low,hig);
                    ++low;
                    --hig;
                }
            }
            if(lowIndex < hig)
                quickSort(arr,lowIndex,hig);

            if(low < highIndex)
                quickSort(arr,low,highIndex);

        }
        }
        private static void swap(int[] swapArray,int i,int j){
        int temp = swapArray[i];
        swapArray[i] = swapArray[j];
        swapArray[j] = temp;
          }
          private static  void printArray(int[] array){
              for (int i = 0; i <array.length ; i++) {
                  System.out.print(array[i]+" ");
              }
          }
    }

