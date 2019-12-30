public class AddCalculateFactor {
    public static void main(String[] args) {
        int i=1;
        int count=0;
        for(;i<=5;i++){
            count+=factor(i);
            }
        System.out.println(count);
    }
    public static int factor(int number){
        int result=1;
        int i=1;
        for(;i<=number;i++){
            result*=i;
        }
        return result;
    }
}