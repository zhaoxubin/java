
public class ProductPrice {
    public static void main(String[] args){
        float money = 230;
        String rebate = "";
        if(money > 200){
            int grade = (int)money/200;
            switch(grade){
                case 1:
                    rebate = "������";
                    break;
                case 2:
                    rebate = "������";
                    break;
                case 3:
                    rebate ="������";
            }
            System.out.println("�������ѽ��Ϊ"+money);
            System.out.println("����������"+rebate+"�Ż�");
        }
    }
}
