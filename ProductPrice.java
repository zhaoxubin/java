
public class ProductPrice {
    public static void main(String[] args){
        float money = 230;
        String rebate = "";
        if(money > 200){
            int grade = (int)money/200;
            switch(grade){
                case 1:
                    rebate = "九五折";
                    break;
                case 2:
                    rebate = "八五折";
                    break;
                case 3:
                    rebate ="七五折";
            }
            System.out.println("您的消费金额为"+money);
            System.out.println("您即将享受"+rebate+"优惠");
        }
    }
}
