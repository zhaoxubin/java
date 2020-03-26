import  java.util.Scanner;
 public class RequestCharactorCollection{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scanner.hasNext){
            String str = scan.nextLine();
            StringBuilder builder = new StringBuilder();
            for(i = 0; i < str.length(); i++){
                char temp = str.charAt(i);
                if(builder.toString().contains(temp + ""));
                    builder.append(temp);
                )
            }
            System.out.println(builder.toString());
        }
    }
}符串包含的字符集合