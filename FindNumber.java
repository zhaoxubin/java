public class FoundNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,2,3};
        int i=0;
        for(;i<array.length;i++){
            int j=0;
            for(j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    array[i]=0;
                    array[j]=0;
                }
            }
        }
        for(i=0;i<array.length;i++){
            if(array[i]!=0){
                System.out.println(array[i]);
            }
        }

    }
}