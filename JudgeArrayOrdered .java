public class JudgeArrayOrdered {
    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        Boolean result = judgeArrayOrdered(array);
        if(result == true){
            System.out.println("�����������");
        } else {
            System.out.println("��������");
        }
    }
    public static boolean judgeArrayOrdered(int[] array){
        int count1 = 0;
        int count2 = 0;
        for (int i = 0;i < array.length-1; i++){  //�ж������Ƿ񵥵�����
            if(array[i]<array[i+1]){
                count1++;
            }
        }
        for (int i = 0;i < array.length-1; i++){    //�ж������Ƿ񵥵��ݼ�
            if(array[i]>array[i+1]){
                count2++;
            }
        }
        if(count1 == array.length-1||count2 == array.length-1){  //����һ��������Ϊ��������
            return true;
        }
       return false;
    }
}

