public class JudgeArrayOrdered {
    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        Boolean result = judgeArrayOrdered(array);
        if(result == true){
            System.out.println("数组是有序的");
        } else {
            System.out.println("数组无序");
        }
    }
    public static boolean judgeArrayOrdered(int[] array){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0;i < array.length-1; i++){  //判断数组是否单调递增
            if(array[i]<array[i+1]){
                count1++;
            }
        }
        for (int i = 0;i < array.length-1; i++){    //判断数组是否单调递减
            if(array[i]>array[i+1]){
                count2++;
            }
        }
        if(count1 == array.length-1||count2 == array.length-1){  //满足一个条件及为有序数组
            return true;
        }
       return false;
    }
}

