import java.util.Scanner;
public class FoundNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������߸�����������ȣ�һ��������");
        int[] array = new int [7];
        int i=0;
        for(;i<array.length;i++){
             array[i] = scanner.nextInt();
        }
       int result = find(array);
        System.out.println("��������Ϊ"+result);
    }
    public static int find(int[] array){
        int i = 0;
        for(;i<array.length;i++){
            int j = 0;
            for(j = i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    array[i] = 0;
                    array[j] = 0;
                }
            }
        }
        for(i=0;i<array.length;i++){
            if(array[i]!=0){

          break;
            }
        }
        return array[i];
    }
}
