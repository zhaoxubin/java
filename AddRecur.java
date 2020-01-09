public class AddRecur {
    public static void main(String[] args) {
        int num = 10;
        int result = add(num);
        System.out.println(result);
    }
    public static int add(int num){
        if(num==1){
            return 1;
        }
        return num+add(num-1);
    }
}