public class RealizeIndexOf {
    public static void main(String[] args) {
        String str = "abcdefghcde";  //定义要被查找一个字符串
        String str1 = "cde";  //定义一个要查找的字符串
        int result = indexOf(str,str1);   //调用indexOf方法
        System.out.println(result);
    }
    public static int indexOf(String str,String str1){
        int ret = 0;   //定义一指针，用来遍历字符串
        int result = 0;  //定义一个变量，用来判断是不是要去查找的字符串
        int index = 0;   //定义一个变量，用来保存及返会要去查找的字符串第一个字母在被查找串中的位置
      while(ret < str.length()){ //当指针小于字符串长度持续查找
          if(str.charAt(ret) == str1.charAt(0)){   //当被查找串的第ret个字符和要查找字符串的第一个字符相等时，开始判断是否为子串
              for(int j = 0; j < str1.length(); j++){  //从首元素开始逐个比较
                  if(str.charAt(ret+j) == str1.charAt(j)){
                      result ++; //如果相等即++判等变量
                  } else {
                      result = 0;   //如果在循环内对应字符不相等，即不是子串，重置判等变量为0
                  }
              }
              if(result  == str1.length()){  //循环结束时如果result等于要去查找的字符串的长度，即是字串
                  index = ret; // 等于即保存第一个下标
                 break; //找到了即跳出循环，，当被查字符串中出现两个字串，
                          //即result就不等于str1.length(),会返回-1.即保证了查找到了，返回的总是第一次出现的位置
              }else{
                  index = -1;  //否则置为-1，用来返回，表示没找到
              }
          }
          ret++; //更新被查找字符串的字符位置
      }
      return index; //返回对应位置或-1
    }
}