public class JudgeLeapYear {
    public static void main(String[] args) {
        int year=0;
        for(year=1000;year<=2000;year++){
            leap(year);
        }
    }
    public static void leap(int year){
        if(year%100==0){
            if(year%400==0){   //判断世纪闰年
                System.out.println(year);
            }
        } else {
            if(year%4==0){    //判断普通闰年
                System.out.println(year);
            }
        }
    }
}
