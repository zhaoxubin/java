import java.util.Scanner;
public class TriangleArray{
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.println("请输入您想打印的杨辉三角的行数");
     int  row = scan.nextInt();
     int[][] triangleArray = new int[row][row*2+1]; 
     int n = row*2 + 1; 
     triangleArray[0][row] = 1;
     for(int i = 1; i < row; i++) {       
         for(int j = 1; j < n-1; j++) {
             triangleArray[i][j] = triangleArray[i-1][j+1] + triangleArray[i-1][j-1];   
             //通过循环求得对应位置的数据
         }
     }
     disPlay(triangleArray);  //打印数组
   }
   public static void disPlay(int[][] array) {
       for(int row = 0;row < array.length; row++) {
           for(int col = 0; col < array[row].length; col++) {
               if(array[row][col] != 0) {
                  System.out.printf(array[row][col]+" ");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}