
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int romantoInt = 0;
        for(int i =0; i < n;i++){
              switch(s.charAt(i)){
                  case 'I' : romantoInt = romantoInt + 1;
                  break;
                  case 'V' : romantoInt = romantoInt + 5;
                  break;
                  case 'X' : romantoInt = romantoInt + 10;
                  break;
                  case 'L' : romantoInt = romantoInt + 50;
                  break;
                  case 'C' : romantoInt = romantoInt + 100;
                  break;
                  case 'D' : romantoInt = romantoInt + 500;
                  break;
                  case 'M' : romantoInt = romantoInt + 1000;
                  default: System.out.println("default");
                  break; 
              }
              if(i != 0) {
                      if(((s.charAt(i) == 'V')||(s.charAt(i)=='X'))&&(s.charAt(i-1)== 'I'))
                      romantoInt = romantoInt - 1*2;
                      if(((s.charAt(i) == 'L')||(s.charAt(i)=='C'))&&(s.charAt(i-1)=='X'))
                       romantoInt = romantoInt - 10*2;
                      if(((s.charAt(i) == 'D')||(s.charAt(i)=='M'))&&(s.charAt(i-1)=='C'))
                      romantoInt = romantoInt -100*2;
              }
        }
        return romantoInt;
    }
}


