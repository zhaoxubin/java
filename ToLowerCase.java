class Solution {
    public String toLowerCase(String str) {
      String result = "";
      for(int i = 0;i <= str.length();i++) {
          char temp = str.charAt(i);
          if(temp >= 65 && temp <=90){
              temp += 32;
          }
          result += temp;
      }
      return result;
    }
}
import util.java.*
public class ToLowerCase{
 public static void main(String[] args){
    Solution test = new Solution();
    Scanner scan = newScanner(System.in);
   Strint  ch = scan.nextLine();
   String result = Solution.toLowerCase(ch);
    System.out.println(result);
} 
}