public class Find9 {
    public static void main(String[] args) {
        int i=1;
        int count=0;
        for(i=1;i<100;i++){
            if(i<10) {
                if (i % 10 == 9) {
                    count++;
                }
            }else {
                    if (i%10==9) {
                        count++;
                    }
                    if ((i/10)%10==9) {
                        count++;
                    }
                }
            }

        System.out.println("1-100之间有"+count+"个9");
    }
}
